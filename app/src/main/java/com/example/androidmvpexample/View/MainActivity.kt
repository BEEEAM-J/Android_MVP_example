package com.example.androidmvpexample.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidmvpexample.Presenter.MainContract
import com.example.androidmvpexample.Presenter.MainPresenter
import com.example.androidmvpexample.R


// View
class MainActivity() : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = MainPresenter(this)

        val edtId = findViewById<EditText>(R.id.edt_id)
        val edtPassword = findViewById<EditText>(R.id.edt_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            presenter.login(edtId.text.toString(), edtPassword.text.toString())
        }
    }

    override fun showResult(status: Boolean) {
        val tvResult = findViewById<TextView>(R.id.tv_result)

        if (status) {
            tvResult.text = "성공!"
        } else {
            tvResult.text = "실패.."
        }
    }
}