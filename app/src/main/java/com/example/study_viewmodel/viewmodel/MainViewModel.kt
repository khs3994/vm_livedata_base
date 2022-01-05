package com.example.study_viewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _height = MutableLiveData<Int>() //라이브데이터

    val height: LiveData<Int>
        get() = _height //라이브 데이터에 접근하기 위한 코드

    init {
        _height.value = 170 //기본값 설정
    }

    fun increase() {
        _height.value = _height.value?.plus(1) // 1씩 증가하는 함수
    }
}