package com.sck.login_hello

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginTest {
    private lateinit var stringLoginButton: String

    @get:Rule
    var activityRule :ActivityTestRule<LoginActivity> = ActivityTestRule(LoginActivity::class.java)

    @Before
    fun initValidString() {
        stringLoginButton = "BUTTON"
    }
    @Test
    fun changeText_sameActivity() {

        onView(withId(R.id.loginButton))
            .perform(click())

        onView(withId(R.id.helloText)).check(matches(withText("Hello World!")))
    }
}