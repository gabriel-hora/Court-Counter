package com.example.courtcounter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _valueScoreALiveData = MutableLiveData(0)
    val valueScoreALiveData: LiveData<Int> = _valueScoreALiveData

    private val _valueScoreBLiveData = MutableLiveData(0)
    val valueScoreBLiveData: LiveData<Int> = _valueScoreBLiveData

    // Region increase Team A
    fun addOneForTeamA() {
        _valueScoreALiveData.value = valueScoreALiveData.value?.plus(1)
    }

    fun addThreeForTeamA() {
        _valueScoreALiveData.value = valueScoreALiveData.value?.plus(3)
    }

    fun addSixForTeamA() {
        _valueScoreALiveData.value = valueScoreALiveData.value?.plus(6)
    }

    fun addNineForTeamA() {
        _valueScoreALiveData.value = valueScoreALiveData.value?.plus(9)
    }

    fun addTwelveForTeamA() {
        _valueScoreALiveData.value = valueScoreALiveData.value?.plus(12)
    }

    //Region increase Team B
    fun addOneForTeamB() {
        _valueScoreBLiveData.value = valueScoreBLiveData.value?.plus(1)
    }

    fun addThreeForTeamB() {
        _valueScoreBLiveData.value = valueScoreBLiveData.value?.plus(3)
    }

    fun addSixForTeamB() {
        _valueScoreBLiveData.value = valueScoreBLiveData.value?.plus(6)
    }

    fun addNineForTeamB() {
        _valueScoreBLiveData.value = valueScoreBLiveData.value?.plus(9)
    }

    fun addTwelveForTeamB() {
        _valueScoreBLiveData.value = valueScoreBLiveData.value?.plus(12)
    }
}