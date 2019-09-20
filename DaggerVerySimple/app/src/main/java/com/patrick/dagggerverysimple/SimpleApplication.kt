package com.patrick.dagggerverysimple

import android.app.Application
import com.patrick.dagggerverysimple.dagger.DaggerSimpleComponent
import com.patrick.dagggerverysimple.dagger.SimpleComponent

class SimpleApplication : Application() {

    lateinit var simpleComponent: SimpleComponent

    override fun onCreate() {
        super.onCreate()
        simpleComponent = initDaggerComponent()
    }

    private fun initDaggerComponent() = DaggerSimpleComponent.create()

}