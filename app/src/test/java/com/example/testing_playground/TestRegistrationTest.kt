package com.example.testing_playground

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class TestRegistrationTest {

    @Test
    fun `empty username returns false`(){
        val testResult = TestRegistration.checkRegistrationInput(
            "",
            "123456",
            "123456"
        )
        assertThat(testResult).isFalse()
    }

    @Test
    fun `username inserted is valid and repeatPassword field matches with password returns true`(){
        val testResult = TestRegistration.checkRegistrationInput(
            "Ebba",
            "123456",
            "123456"
        )
        assertThat(testResult).isTrue()
    }

    @Test
    fun `username is taken returns false`(){
        val testResult = TestRegistration.checkRegistrationInput(
            "Carlos",
            "123456",
            "123456"
        )
        assertThat(testResult).isFalse()
    }

    //------------------------  HomeWork
    // password length is greater or equal than 5 characters
    // password and repeatPassword match
    // password is not empty

    @Test
    fun `password length is greater or equal than 5 characters returns true`(){
        val testResult = TestRegistration.checkRegistrationInput(
            "",
            "123456",
            "123456"
        )
        assertThat(testResult).isFalse()
    }



}