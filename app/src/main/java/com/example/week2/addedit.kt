package com.example.week2

import android.app.Activity
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.week2.database.universalVar
import com.example.week2.databinding.ActivityAddeditBinding
//import com.example.week2.model.sapi
import java.lang.NumberFormatException
import com.example.week2.model.models as models

class addedit : AppCompatActivity() {

//    private lateinit var viewBind: ActivityAddeditBinding
    private lateinit var models : models
//    private lateinit var sapi : sapi
    private lateinit var viewBind: ActivityAddeditBinding
    private lateinit var imageArray: ByteArray
    var images: String = ""
    var position : Int = 0
//    var type : String = ""

//    private val GetResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//        if (it.resultCode == RESULT_OK){
//            val uri = it.data?.data
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//                if(uri != null){
//                    baseContext.getContentResolver().takePersistableUriPermission(uri,
//                        Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
//                    )
//                }}
//            viewBind.imageView2.setImageURI(uri)
//            images = uri.toString()
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addedit)
        setContentView(viewBind.root)
        getintent()
        listener()
    }


    fun getintent (){
        if (intent.getIntExtra("status", 0) == universalVar.statusAdd){
            viewBind.formTitleEdit.visibility = View.INVISIBLE
        }else if (intent.getIntExtra("status", 0) == universalVar.statusEdit){
            position = intent.getIntExtra("position", -1)
            viewBind.formTitleTambah.visibility = View.INVISIBLE
            viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
            viewBind.age.editText?.setText(universalVar.listAnimals[position].age.toString())
//            viewBind.FormInputJenisHewan.editText?.setText(GlobalVar.ListDataHewan[position].JenisHewan)
            if(viewBind.animalType.checkedRadioButtonId == viewBind.Sapi.id){
//                viewBind.animalType.checkedRadioButtonId.equals()

                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
                    ?.equals(viewBind.animalType.checkedRadioButtonId)
            } else if (viewBind.animalType.checkedRadioButtonId == viewBind.Ayam.id){
                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
                    ?.equals(viewBind.animalType.checkedRadioButtonId)
            } else if (viewBind.animalType.checkedRadioButtonId == viewBind.Kambing.id){
                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
                    ?.equals(viewBind.animalType.checkedRadioButtonId)
            }

//            if(universalVar.listAnimals[position].animalImage != "null") {
//                val bArray = universalVar.StringToByteArr(universalVar.listAnimals[position].animalImage)
//                val options = BitmapFactory.Options()
//                options.inSampleSize = 2
//                options.inScaled = true
//                val bitMap = BitmapFactory.decodeByteArray(
//                    bArray,
//                    0,
//                    bArray.size,
//                    options
//                )
//                viewBind.formImage.setImageBitmap(bitMap)
//            } else {
//
//            }
        } else {

        }

//        position = intent.getIntExtra("postion", -1)
//        if(position != -1){
//            val animals = universalVar.listAnimals[position]
////            viewBind.formTitleEdit. = "Edit hewan peternakan"
//            viewBind.btnSubmit.text = "Edit"
//            viewBind.name.editText?.setText(animals.name)
//            viewBind.age.editText?.setText(animals.age)
//            if(viewBind.animalType.checkedRadioButtonId == viewBind.Sapi.id){
//                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
//                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
//                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
//            } else if (viewBind.animalType.checkedRadioButtonId == viewBind.Ayam.id){
//                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
//                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
//                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
//            } else if (viewBind.animalType.checkedRadioButtonId == viewBind.Kambing.id){
//                viewBind.name.editText?.setText(universalVar.listAnimals[position].name)
//                viewBind.age.editText?.setText(universalVar.listAnimals[position].age)
//                viewBind.animalTypeChecked.editText?.setText(universalVar.listAnimals[position].animalType.toString())
//            }
//        }
    }

    private fun listener(){
        viewBind.formImage.setOnClickListener{
            val myIntent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            myIntent.type = "image/*"
            getResult.launch(myIntent)
        }

//        viewBind.btnSubmit.setOnClickListener{
//            var name = viewBind.name.editText?.text.toString().trim()
//            var age = viewBind.age.editText?.text.toString().trim()
//            var animalType = viewBind.animalType.id.toString().trim()
//
////            models = (name , age , animalType)
//
//        }
        if (viewBind.animalType.checkedRadioButtonId == viewBind.Sapi.id){
//            var name = viewBind.name.editText?.text.toString().trim()
//            var age = viewBind.age.editText?.text.toString().trim()
//            var animalType = viewBind.animalType.id.toString().trim()

            var image = universalVar.ByteArrToString(imageArray!!)
            var name = viewBind.name.editText?.text.toString().trim()
            var animalType = viewBind.animalTypeChecked.editText?.text.toString().trim()
            var age = viewBind.age.editText?.text.toString().trim()

//            sapi = sapi(image , name , animalType , age)
        }

//        viewBind.toolbars.getChildAt(1).setOnClickListener {
//            finish()
//        }


//        viewBind.formImage.setOnClickListener {
//            val myIntent = Intent(Intent.ACTION_PICK)
//            myIntent.type = "image/*"
//            getResult.launch(myIntent)
//        }
//
//        viewBind.btnSubmit.setOnClickListener{
//            if (viewBind.animalType.checkedRadioButtonId == viewBind.Sapi.id){
//                try{
//
//
//                        val sapi = sapi (
//                            universalVar.ByteArrToString(imageArray!!),
//                            viewBind.name.editText?.text.toString().trim(),
//                            viewBind.animalTypeChecked.editText?.text.toString().trim(),
//                            viewBind.age.editText?.text.toString().trim()
//                        )
//
//                        if (checker(sapi)){
//                            if (intent.getIntExtra("status", 0) == universalVar.statusAdd){
//                               universalVar.listAnimals.add(sapi)
//                            } else if (intent.getIntExtra("status", 0) == universalVar.statusEdit){
//                                universalVar.listAnimals[position] = sapi
//                            }
//                            Toast.makeText(baseContext, "Data berhasil di simpan", Toast.LENGTH_LONG).show()
//                            finish()
//                        }else{
//                            Toast.makeText(baseContext, "Data gagal di simpan", Toast.LENGTH_LONG).show()
//                        }
//
//
//
//
//
//                }catch (e: NumberFormatException){
//                    viewBind.age.error = "Umur hewan belum terisi"
//                }catch (e: UninitializedPropertyAccessException){
//                    if (intent.getIntExtra("status", 0) == universalVar.statusEdit){
//                        val hewan = sapi(
//                            viewBind.name.editText?.text.toString().trim(),
//                            viewBind.animalTypeChecked.editText?.text.toString().trim(),
//                            viewBind.age.editText?.text.toString().trim(),
//                            universalVar.listAnimals[position].animalImage
//                        )
//
//                        if (checker(hewan)){
//                            universalVar.listAnimals[position] = hewan
//                            Toast.makeText(baseContext, "Data berhasil di simpan", Toast.LENGTH_LONG).show()
//                            finish()
//                        }else{
//                            Toast.makeText(baseContext, "Data gagal di simpan", Toast.LENGTH_LONG).show()
//                        }
//                    }
//                    Toast.makeText(baseContext, "Foto Hewan belum di pilih", Toast.LENGTH_LONG).show()
//                }
//            }
//        }
      }

    private val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//        if (it.resultCode == Activity.RESULT_OK){   // APLIKASI GALLERY SUKSES MENDAPATKAN IMAGE
//            val uri = it.data?.data                 // GET PATH TO IMAGE FROM GALLEY
//            viewBind.formImage.setImageURI(uri)  // MENAMPILKAN DI IMAGE VIEW
//            if (uri != null) {
//                val inputStream = contentResolver.openInputStream(uri)
//                inputStream?.buffered()?.use {
//                    imageArray = it.readBytes()
//                }
//            }
//        }
        if (it.resultCode == RESULT_OK){
            val uri = it.data?.data
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if(uri != null){
                    baseContext.getContentResolver().takePersistableUriPermission(uri,
                        Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
                    )
                }}
            viewBind.formImage.setImageURI(uri)
            images = uri.toString()
        }
    }

//    Membuat function checker untuk error handling saat pengisian form
    private fun checker(models: models) : Boolean{
//    Menggunakan boolean karena untuk membuat kondisi
        var isComplete = true

//    Membuat kondisi jika form nama hewan kosong
    if (models.name.isEmpty()){
//        .error digunakan untuk memberikan alert jika terjadi error
        viewBind.name.error = "Nama hewan tidak boleh kosong !"
        isComplete = false
    } else {
        viewBind.name.error = ""
    }

//    Membuat kondisi jika form umur hewan kosong
    if (models.age.isEmpty()){
        viewBind.age.error = "Umur hewan tidak boleh kosong"
        isComplete = false
    } else {
        viewBind.age.error = ""
    }

//    Mengecek jika animal type tidak diberikan nilai
    if (viewBind.animalType.checkedRadioButtonId == -1){
        Toast.makeText(this , "Tolong pilih jenis hewannya", Toast.LENGTH_SHORT).show()
        isComplete = false
    }

    return isComplete
    }
}


