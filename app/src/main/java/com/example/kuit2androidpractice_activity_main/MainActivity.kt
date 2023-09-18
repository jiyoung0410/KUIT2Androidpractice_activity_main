package com.example.kuit2androidpractice_activity_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kuit2androidpractice_activity_main.databinding.ActivityMainBinding
import com.example.kuit2androidpractice_activity_second.SecondActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding class를 가져옴
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val btn = findViewById<Button>(R.id.b_go)

//        button 클릭하면 실행할 동작 정의
//        binding쓰기 전 코드
//        btn.setOnClickListener {
//            //second Activity로 이동
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        }

        binding.bGo.setOnClickListener {
            //second Activity로 이동
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}