package com.example.android_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namaView : EditText
    private lateinit var kelasView: EditText
    private lateinit var nisView: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY :String = "nama"
    private val KELAS_KEY :String  = "kelas"
    private val AGE_KEY :String = "nis"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaView = findViewById(R.id.namaView)
        kelasView= findViewById(R.id.kelasView)
        nisView= findViewById(R.id.nisView)
        submitBtn= findViewById(R.id.submitBtn)
    }
}