package com.example.androidmvpexample.Presenter

import com.example.androidmvpexample.Model.Data

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {

    val data = Data()

    override fun getResult(n: Int) {
        view.showResult(n * data.multiple)
    }
}