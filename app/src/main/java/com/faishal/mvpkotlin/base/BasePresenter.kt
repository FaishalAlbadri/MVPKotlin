package com.faishal.mvpkotlin.base

interface BasePresenter<T> {

    fun onAttachView(view: T)

    fun onDettachView()

}