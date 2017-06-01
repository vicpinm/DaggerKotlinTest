package com.example.daggertest.components

/**
 * Created by Oesia on 01/06/2017.
 */

import com.example.daggertest.MainActivity
import com.example.daggertest.modules.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}
