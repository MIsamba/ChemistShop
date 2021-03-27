package com.example.chemistshop.database.helper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.chemistshop.ChemMedDBContract

class DatabaseHelper(
    context: Context?

) : SQLiteOpenHelper(context,
    DATABASE_NAME, null,
    DATABASE_VERSION
) {


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(ChemMedDBContract.MedicineEntry.SQL_CREATE_ENTRIES)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db?.execSQL(ChemMedDBContract.MedicineEntry.SQL_DROP_TABLE)
        onCreate(db)

    }

    companion object {
        const val DATABASE_NAME = "Chemmed.db"
        const val DATABASE_VERSION = 1
    }

}