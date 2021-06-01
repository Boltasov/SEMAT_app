package com.example.semat_app.features.alpha.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.semat_app.Test

class AlphaVM : ViewModel() {

    private val stages = mutableListOf<Test>(
        Test("Первая", 1),
        Test("Вторая", 2),
        Test("Третья", 3),
        Test("Четвёртая", 4)
    )

    private val _stagesState = MutableLiveData<List<Test>>(stages)
    val stagesState : LiveData<List<Test>> = _stagesState

/*  Это реализовано словом stages в скобочках на 3 строки выше

    init {
        _filmsState.value = stages
    }*/

    private val _openDetail = MutableLiveData<Test>()
    val openDetail: LiveData<Test> = _openDetail

    fun onStageClick(test: Test) {
        _openDetail.value = test
    }
}