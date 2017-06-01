package com.example.daggertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.example.daggertest.model.TestObject

import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject @Named("test1") lateinit var test: TestObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Application.mComponent.inject(this)
    }
}
