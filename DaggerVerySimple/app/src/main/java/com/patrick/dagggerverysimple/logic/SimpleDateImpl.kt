package com.patrick.dagggerverysimple.logic

import java.util.*

class SimpleDateImpl : SimpleDate {
    override fun dateString(): String = Date().toString()
}