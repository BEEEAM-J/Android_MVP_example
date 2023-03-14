package com.example.androidmvpexample.Presenter

// Contract
// 여기서 interface 형식으로 view와 presenter를 선언
// 필수 요소는 아닌데 사용하면 좋은 것 같음(기능들이 한 눈에 들어와서)

interface MainContract {

    interface View {
        fun showResult(res: Int)
    }

    interface Presenter {
        fun getResult(n: Int)
    }


}