package com.example.chemistshop.database

import com.example.chemistshop.ChemMedDBContract
import com.example.chemistshop.database.helper.DatabaseHelper
import com.example.chemistshop.model.Iskmedicine

object DataManager {

        fun fetchAllEmployees ( databaseHelper: DatabaseHelper) : ArrayList<Iskmedicine> {

            val iskmedicine = ArrayList<Iskmedicine>()

            val db = databaseHelper.readableDatabase

            val columns = arrayOf(
                ChemMedDBContract.MedicineEntry.COLUMN_ID,
                ChemMedDBContract.MedicineEntry.COLUMN_NAME,
                ChemMedDBContract.MedicineEntry.COLUMN_DOB,
                ChemMedDBContract.MedicineEntry.COLUMN_DESIGNATION

            )

            val cursor = db.query(
                ChemMedDBContract.MedicineEntry.TABLE_NAME,
                columns,
                null,
                null,
                null,
                null,
                null
            )

            val idPos = cursor.getColumnIndex(ChemMedDBContract.MedicineEntry.COLUMN_ID)
            val namePos = cursor.getColumnIndex(ChemMedDBContract.MedicineEntry.COLUMN_NAME)
            val dobPos = cursor.getColumnIndex(ChemMedDBContract.MedicineEntry.COLUMN_DOB)
            val designationPos = cursor.getColumnIndex(ChemMedDBContract.MedicineEntry.COLUMN_DESIGNATION)

            while (cursor.moveToNext()) {
                val id = cursor.getString(idPos)
                val name = cursor.getString(namePos)
                val dob = cursor.getLong(dobPos)
                val designation = cursor.getString(designationPos)

                iskmedicine.add(
                    Iskmedicine(
                        id,
                        name,
                        dob,
                        designation
                    )
                )
            }

            cursor.close()
            return iskmedicine
        }
    }
