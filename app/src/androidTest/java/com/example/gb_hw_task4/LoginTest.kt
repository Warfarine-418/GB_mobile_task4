package com.example.gb_hw_task4

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.gb_hw_task4.pages.LoginPage
import com.example.gb_hw_task4.ui.login.LoginActivity
import org.junit.Rule
import org.junit.Test

class LoginTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLoginButtonIsEnableWithValidData() {
        LoginPage().setUserName("test")
            .setUserPassword("123123123")
            .checkLoginButtonIsEnabled()
    }

    @Test
    fun checkLoginButtonIsDisabledWithoutData() {
        LoginPage().checkLoginButtonIsDisabled()
    }

    @Test
    fun checkLoginButtonIsDisabledWithUsernameButWithoutPassword() {
        LoginPage().setUserName("test")
            .checkLoginButtonIsDisabled()
    }

    @Test
    fun checkLoginButtonIsDisabledWithUsernameButWithInvalidPassword() {
        LoginPage().setUserName("test")
            .setUserPassword("123")
            .checkLoginButtonIsDisabled()
    }

    @Test
    fun checkLoginButtonIsDisabledWithoutUsernameButWithValidPassword() {
        LoginPage().setUserPassword("123123123")
            .checkLoginButtonIsDisabled()
    }

}