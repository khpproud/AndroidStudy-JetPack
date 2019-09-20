package com.patrick.dagggerverysimple.dagger

import com.patrick.dagggerverysimple.SimpleActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SimpleModule::class])
interface SimpleComponent {

    fun inject(target: SimpleActivity)
}