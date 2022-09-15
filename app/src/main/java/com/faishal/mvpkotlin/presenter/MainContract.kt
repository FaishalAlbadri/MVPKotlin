package com.faishal.mvpkotlin.presenter

import com.faishal.mvpkotlin.base.BasePresenter

class MainContract {

    interface mainView {
        fun onSuccessHitung(hasil: Int)
    }

    interface mainPresenter : BasePresenter<mainView> {
        fun hitung(satu: Int, dua: Int, mode: String)
    }
}