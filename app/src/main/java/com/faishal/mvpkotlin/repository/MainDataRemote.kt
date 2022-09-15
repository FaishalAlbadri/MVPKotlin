package com.faishal.mvpkotlin.repository

import android.content.Context
import androidx.annotation.NonNull

class MainDataRemote(context: Context) : MainDataResource {

    val context: Context = context;

    override fun hitung(satu: Int, dua: Int, mode: String, @NonNull hitungCallback: MainDataResource.HitungCallback) {
        var jumlah = 0

        if (mode.equals("+")) {
            jumlah = satu + dua;
        } else if (mode.equals("-")) {
            jumlah = satu - dua;
        } else if (mode.equals("*")) {
            jumlah = satu * dua;
        } else if (mode.equals("/")) {
            jumlah = satu / dua;
        }

        hitungCallback.onSuccessHitung(jumlah)
    }

}