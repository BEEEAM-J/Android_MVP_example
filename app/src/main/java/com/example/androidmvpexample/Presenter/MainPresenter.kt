package com.example.androidmvpexample.Presenter

import com.example.androidmvpexample.Model.Data

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {

    override val data: Data
        get() = Data()

    override fun login(usrId: String?, usrPasswd: String?) {
        var loginStatus = data.login(usrId, usrPasswd)
        view.showResult(loginStatus)
    }
}