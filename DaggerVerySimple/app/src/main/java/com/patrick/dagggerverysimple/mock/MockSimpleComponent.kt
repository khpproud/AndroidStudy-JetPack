package com.patrick.dagggerverysimple.mock

import com.patrick.dagggerverysimple.dagger.SimpleComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockSimpleModule::class])
interface MockSimpleComponent : SimpleComponent {
}