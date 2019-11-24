package com.dhbwka.se.tinf18b2.cardgame


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
@LargeTest
class UITestMainMenu {

    private lateinit var stringToBetyped: String

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Specify a valid string.
        stringToBetyped = "Espresso"
    }

    @Test
    fun clickmenu_settings() {
        // Type text and then press the button.

        onView(withId(R.id.menuButton)).perform(click())

    }
    @Test
    fun clickmenuSettingsPrivacyPolicy() {
        // Type text and then press the button.

        onView(withId(R.id.menuButton)).perform(click())
        onView(withId(R.id.privacy)).perform(click())

    }

}
