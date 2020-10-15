package com.example.testing_playground

object TestRegistration  {

    private val usernameAlreadyTaken = listOf("Alvaro", "Carlos", "Valentina")

    //documentation
    /**
     *  input is wrong if :
     *  ------ username/password field is empty
     *  ------ password/checkPassword don't match
     *  ------ password length is less than 5 characters
     *  ------ username selected is already taken
     */

    fun checkRegistrationInput(
        username: String,
        password: String,
        checkPassword: String
    ) :Boolean {
        return true
    }
}