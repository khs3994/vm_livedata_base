package com.example.study_viewmodel.base

import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.study_viewmodel.viewmodel.MainViewModel


abstract class baseActivity<T: ViewDataBinding>(@LayoutRes private val layoutResId : Int): AppCompatActivity(){
   protected lateinit var viewDataBinding: T //바인딩 설정
   protected val mainViewModel: MainViewModel by viewModels() //뷰모델 객체 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this,layoutResId)
        init()
    }

    abstract fun init()
}