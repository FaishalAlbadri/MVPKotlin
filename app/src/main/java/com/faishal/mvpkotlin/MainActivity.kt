package com.faishal.mvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.faishal.mvpkotlin.di.MainRepositoryInject
import com.faishal.mvpkotlin.presenter.MainContract
import com.faishal.mvpkotlin.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.mainView {

    private lateinit var mainPresenter: MainPresenter

    private lateinit var btnTambah: Button
    private lateinit var btnKurang: Button
    private lateinit var btnKali: Button
    private lateinit var btnBagi: Button
    private lateinit var edtSatu: EditText
    private lateinit var edtDua: EditText
    private lateinit var txtHasil: TextView

    private var mode: String = ""
    private var satu: Int = 0
    private var dua: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
        buttonOnclick()

    }

    private fun setView() {
        btnTambah = findViewById(R.id.btn_tambah)
        btnKurang = findViewById(R.id.btn_kurang)
        btnKali = findViewById(R.id.btn_kali)
        btnBagi = findViewById(R.id.btn_bagi)
        edtSatu = findViewById(R.id.edt_satu)
        edtDua = findViewById(R.id.edt_dua)
        txtHasil = findViewById(R.id.txt_hasil)

        mainPresenter = MainPresenter(MainRepositoryInject.provideTo(this))
        mainPresenter.onAttachView(this)
    }

    override fun onSuccessHitung(hasil: Int) {
        txtHasil.setText("${edtSatu.text} ${mode} ${edtDua.text} adalah ${hasil}")
    }

    private fun buttonOnclick() {
        btnTambah.setOnClickListener {
            if (!edtSatu.text.isEmpty() && !edtDua.text.isEmpty()) {
                satu = edtSatu.text.toString().toInt()
                dua = edtDua.text.toString().toInt()
                mode = "+"

                mainPresenter.hitung(satu , dua, mode)
            } else {
                Toast.makeText(this, "Masukkan Bilangan", Toast.LENGTH_SHORT).show()
            }
        }

        btnKurang.setOnClickListener {
            if (!edtSatu.text.isEmpty() && !edtDua.text.isEmpty()) {
                satu = edtSatu.text.toString().toInt()
                dua = edtDua.text.toString().toInt()
                mode = "-"

                mainPresenter.hitung(satu , dua, mode)
            } else {
                Toast.makeText(this, "Masukkan Bilangan", Toast.LENGTH_SHORT).show()
            }
        }

        btnKali.setOnClickListener {
            if (!edtSatu.text.isEmpty() && !edtDua.text.isEmpty()) {
                satu = edtSatu.text.toString().toInt()
                dua = edtDua.text.toString().toInt()
                mode = "*"

                mainPresenter.hitung(satu , dua, mode)
            } else {
                Toast.makeText(this, "Masukkan Bilangan", Toast.LENGTH_SHORT).show()
            }
        }

        btnBagi.setOnClickListener {
            if (!edtSatu.text.isEmpty() && !edtDua.text.isEmpty()) {
                satu = edtSatu.text.toString().toInt()
                dua = edtDua.text.toString().toInt()
                mode = "/"

                mainPresenter.hitung(satu , dua, mode)
            } else {
                Toast.makeText(this, "Masukkan Bilangan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}