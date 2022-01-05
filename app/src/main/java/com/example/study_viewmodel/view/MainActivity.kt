package com.example.study_viewmodel.view

import android.util.Log
import androidx.lifecycle.Observer
import com.example.study_viewmodel.R
import com.example.study_viewmodel.base.baseActivity
import com.example.study_viewmodel.databinding.ActivityMainBinding

class MainActivity : baseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun init() {
        viewDataBinding.mainvm = mainViewModel

        obServefun()
        onClickfun()
    }

    private fun onClickfun() {
        viewDataBinding.plusbtn.setOnClickListener{ //버튼이 눌렸을 때 viewmodel의 increase함수 실행
            mainViewModel.increase()
        }
    }

    private fun obServefun() {
        mainViewModel.height.observe(this, Observer { // 결과값(사용자의 키)이 바뀌었을때
            Log.d("UserHeight","user height has changed by : $it")
            viewDataBinding.textViewHeight.text = it.toString()
        })
    }
}