package com.patrick.dagggerverysimple.mock

import com.patrick.dagggerverysimple.logic.SimpleDate
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MockSimpleModule {
    @Provides
    @Singleton
    fun provideMockSimpleDate(): SimpleDate = MockSimpleDateImpl()
}