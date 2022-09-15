package com.faishal.mvpkotlin.repository

import androidx.annotation.NonNull

interface MainDataResource {

    fun hitung(satu: Int, dua: Int, mode: String, @NonNull hitungCallback: HitungCallback)

    interface HitungCallback {
        fun onSuccessHitung(hasil: Int)
    }
}