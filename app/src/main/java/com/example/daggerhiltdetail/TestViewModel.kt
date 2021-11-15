package com.example.daggerhiltdetail

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String2") private val testString2: String
) : ViewModel() {
    
    init {
        Log.d("TestViewModel", "Test String from viewmodel: $testString2")
    }
    
}