package com.example.testing_playground.tests

import android.content.Context

class TestingComponent {

    fun compareGivenTextToResourceText(context: Context, textResource: Int , givenString:String) : Boolean{
        return context.getString(textResource) == givenString
    }

}