package com.faishal.mvpkotlin.repository

import androidx.annotation.NonNull

class MainRepository : MainDataResource{

    private var mainDataResource: MainDataResource

    constructor(mainDataResource: MainDataResource){
        this.mainDataResource = mainDataResource
    }

    override fun hitung(satu: Int, dua: Int, mode: String, @NonNull hitungCallback: MainDataResource.HitungCallback) {
        mainDataResource.hitung(satu, dua, mode, hitungCallback)
    }

}