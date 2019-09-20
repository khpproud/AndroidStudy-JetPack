package com.patrick.dagggerverysimple.dagger

import com.patrick.dagggerverysimple.logic.SimpleDate
import com.patrick.dagggerverysimple.logic.SimpleDateImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SimpleModule {
    @Provides
    @Singleton
    fun provideSimpleDate(): SimpleDate = SimpleDateImpl()
}