package com.example.androidmvpexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidmvpexample.Model.Data
import com.example.androidmvpexample.Presenter.MainContract
import com.example.androidmvpexample.Presenter.MainPresenter


// View
class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = MainPresenter(this)

        val edt1 = findViewById<EditText>(R.id.edt1)
        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            presenter.getResult(edt1.text.toString().toInt())
        }
    }

    override fun showResult(res: Int) {
        val tv1 = findViewById<TextView>(R.id.text1)

        tv1.text = "$res"
    }
}