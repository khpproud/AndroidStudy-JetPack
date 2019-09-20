package com.patrick.dagggerverysimple.mock

import com.patrick.dagggerverysimple.logic.SimpleDate
import java.util.*

class MockSimpleDateImpl : SimpleDate {
    override fun dateString(): String = Date(0L).toString()
}