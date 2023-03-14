package com.example.androidmvpexample.Presenter

import com.example.androidmvpexample.Model.Data

// Contract
// 여기서 interface 형식으로 view와 presenter를 선언
// 필수 요소는 아닌데 사용하면 좋은 것 같음(기능들이 한 눈에 들어와서)

interface MainContract {

    interface View {
        fun showResult(status: Boolean)
    }

    interface Presenter {
        val data: Data
        fun login(id: String?, passwd: String?)
    }
}