package com.example.kuit2androidpractice_activity_second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kuit2androidpractice_activity_main.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding class를 가져옴
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btn = findViewById<Button>(R.id.b_back)

//        button 클릭하면 실행할 동작 정의
//        btn.setOnClickListener {
//            //Second_Activity로 돌아오기
//            finish();
//        }

        binding.bBack.setOnClickListener {
            //Second_Activity로 돌아오기
            finish();
        }
    }
}