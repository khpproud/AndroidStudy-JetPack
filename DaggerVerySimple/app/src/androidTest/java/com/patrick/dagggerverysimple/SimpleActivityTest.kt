package com.patrick.dagggerverysimple

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import com.patrick.dagggerverysimple.mock.DaggerMockSimpleComponent
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SimpleActivityTest {

    @Before
    fun initMock() {
        val application = InstrumentationRegistry.getInstrumentation()
            .targetContext
            .applicationContext as SimpleApplication
        val mockSimpleComponent = DaggerMockSimpleComponent.create()
        application.simpleComponent = mockSimpleComponent
    }

    @Test
    fun showDateString() {
        val activityScenario = ActivityScenario.launch(SimpleActivity::class.java)
        onView(withId(R.id.tv_date)).check(matches(withText("Thu Jan 01 09:00:00 GMT+09:00 1970")))
    }

}