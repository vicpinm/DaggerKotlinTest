package com.example.daggertest

import com.example.daggertest.components.AppComponent
import com.example.daggertest.components.DaggerAppComponent
import com.example.daggertest.modules.AppModule

/**
 * Created by Oesia on 01/06/2017.
 */

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }


    fun initDagger() {
        mComponent = DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
    }

    companion object {
        lateinit var mComponent: AppComponent
    }
}
