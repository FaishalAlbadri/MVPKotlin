package com.faishal.mvpkotlin.repository

import android.content.Context
import androidx.annotation.NonNull

class MainDataRemote: MainDataResource {

    private var context: Context

    constructor(context: Context) {
        this.context = context
    }

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