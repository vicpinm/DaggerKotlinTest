package com.example.daggertest.modules

import com.example.daggertest.model.TestObject
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Oesia on 01/06/2017.
 */
@Module
class AppModule {

    @Provides @Singleton @Named("test1") fun provider1(): TestObject {
        return TestObject()
    }

    @Provides @Singleton @Named("test2") fun provider2(): TestObject {
        return TestObject()
    }
}
