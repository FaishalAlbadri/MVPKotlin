package com.faishal.mvpkotlin.presenter

import com.faishal.mvpkotlin.repository.MainDataResource
import com.faishal.mvpkotlin.repository.MainRepository

class MainPresenter(mainRepository: MainRepository) : MainContract.mainPresenter {

    val mainRepository: MainRepository = mainRepository
    lateinit var mainView: MainContract.mainView


    override fun hitung(satu: Int, dua: Int, mode: String) {
        mainRepository.hitung(satu, dua, mode, object : MainDataResource.HitungCallback {
            override fun onSuccessHitung(hasil: Int) {
             mainView.onSuccessHitung(hasil)
            }
        })
    }


    override fun onAttachView(view: MainContract.mainView) {
        mainView = view
    }

    override fun onDettachView() {

    }
}