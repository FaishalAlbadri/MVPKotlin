package com.faishal.mvpkotlin.repository

import androidx.annotation.NonNull

class MainRepository(mainDataResource: MainDataResource) : MainDataResource{

    val mainDataResource: MainDataResource = mainDataResource


    override fun hitung(satu: Int, dua: Int, mode: String, @NonNull hitungCallback: MainDataResource.HitungCallback) {
        mainDataResource.hitung(satu, dua, mode, hitungCallback)
    }

}