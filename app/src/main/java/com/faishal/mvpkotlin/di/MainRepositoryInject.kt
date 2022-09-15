package com.faishal.mvpkotlin.di

import android.content.Context
import com.faishal.mvpkotlin.repository.MainDataRemote
import com.faishal.mvpkotlin.repository.MainRepository

class MainRepositoryInject {

    companion object {
        fun provideTo(context: Context): MainRepository {
            return MainRepository(MainDataRemote(context))
        }
    }
}