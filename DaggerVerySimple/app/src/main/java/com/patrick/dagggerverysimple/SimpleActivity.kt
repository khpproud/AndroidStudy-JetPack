package com.patrick.dagggerverysimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrick.dagggerverysimple.logic.SimpleDate
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SimpleActivity : AppCompatActivity() {

    @Inject
    lateinit var simpleDate: SimpleDate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SimpleApplication).simpleComponent
            .inject(this)
        tv_date.text = simpleDate.dateString()
    }
}
