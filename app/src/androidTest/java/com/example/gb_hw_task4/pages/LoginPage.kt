package com.example.gb_hw_task4.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.gb_hw_task4.R

class LoginPage {
    fun setUserName(name: String): LoginPage {
        onView(withId(R.id.username)).perform(ViewActions.typeText(name))
        return this
    }

    fun setUserPassword(pswd: String) : LoginPage{
        onView(withId(R.id.password)).perform(typeText(pswd))
        return this
    }

    fun checkLoginButtonIsDisabled(): LoginPage {
        onView(withId(R.id.login)).check(matches(isNotEnabled()))
        return this
    }

    fun checkLoginButtonIsEnabled(): LoginPage {
        onView(withId(R.id.login)).check(matches(isEnabled()))
        return this
    }
}