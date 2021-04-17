package com.example.chemistshop.ui.prescription

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.chemistshop.R
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_prescription.*

@Suppress("UNREACHABLE_CODE")
class PrescriptionFragment : Fragment() {

    private lateinit var prescriptionViewModel: PrescriptionViewModel
    lateinit var  filepath : Uri

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        prescriptionViewModel =
            ViewModelProviders.of(this).get(PrescriptionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_prescription, container, false)
        val textView: TextView = root.findViewById(R.id.text_prescription)
        prescriptionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it

            bupload.setOnClickListener{
                startFileUpload()

            }
            bsend.setOnClickListener {
                uploadFile()
             }


        })
        return root




    }
    private fun uploadFile() {
        val pd = ProgressDialog ( activity )
        pd.setTitle( " Prescription Uploading")
        pd.show()

        val imageRef = FirebaseStorage.getInstance().reference.child( "images/customerPresc.jpg")
        imageRef.putFile(filepath)

            .addOnSuccessListener {
                pd.dismiss()
                Toast.makeText(activity, "prescription sent successful ", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener {p0 ->
                pd.dismiss()
                Toast.makeText(activity, p0.message, Toast.LENGTH_LONG).show()
            }
            .addOnProgressListener { p0 ->
                var progress = (100.0 * p0.bytesTransferred) / p0.totalByteCount
                pd.setMessage("Uploaded  ${ progress.toInt() } % " )
            }

    }

    private fun startFileUpload() {
        val upload = Intent()
        upload.setType("image/+")
        upload.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(Intent.createChooser(upload, "Upload Prescription"), 111)


        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 111 && resultCode == Activity.RESULT_OK)


        if (data != null) {
            filepath = data.data!!
        }

        var bitmap  = MediaStore.Images.Media.getBitmap(activity?.contentResolver,filepath)
        upload_img.setImageBitmap(bitmap)


    }


}