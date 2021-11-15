package com.example.daggerhiltdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String1")
    lateinit var testString1: String

    @Inject
    @Named("String2")
    lateinit var testString2: String

    @Inject
    @Named("String3")
    lateinit var testString3: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", testString1)
        Log.d("MainActivity", testString2)
        Log.d("MainActivity", testString3)
    }
}