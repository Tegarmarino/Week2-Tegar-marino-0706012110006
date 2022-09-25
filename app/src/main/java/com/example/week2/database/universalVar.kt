package com.example.week2.database

import android.util.Base64
import com.example.week2.model.models

class universalVar {
    companion object {
        val listAnimals = ArrayList<models>()
        val statusAdd = 1
        val statusEdit = 2

        fun ByteArrToString(bArray: ByteArray): String {
            return Base64.encodeToString(bArray, Base64.DEFAULT)
        }

        fun StringToByteArr(raw: String):ByteArray{
            return Base64.decode(raw, Base64.DEFAULT)
        }
    }
}