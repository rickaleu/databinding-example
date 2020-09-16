package br.com.ricardo.databindingviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var number = 1

    private val _counter = MutableLiveData<String>()
    val counter : LiveData<String>
        get() = _counter


    init {
        _counter.value = number.toString()
    }

    fun clickMe() {
        _counter.value = (++number).toString()
    }

    fun resetMe() {
        number = 0
        _counter.value = number.toString()
    }

}