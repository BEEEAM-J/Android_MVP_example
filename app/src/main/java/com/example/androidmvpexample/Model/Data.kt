package com.example.androidmvpexample.Model

data class Data(
    var usrName: String? = null,
    var password: String? = null
) {
    fun login (usrName: String?, password: String?): Boolean {
        return (usrName == "abc" && password == "1234")
    }
}