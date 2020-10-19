package com.example.testing_playground.tests

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.testing_playground.R
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestingComponentTest {


    private lateinit var testingComponent : TestingComponent

    //this annotation makes sure that the code within this fun will be executed before the test cases
    @Before
    fun setup(){ // this name is part of naming convention in Android
        testingComponent = TestingComponent()   //just init i order to be used later on.
    }

    //this annotation makes sure that the code within the function is destroyed once the test cases are done
    @After
    fun tearDown(){ // this name is part of naming convention in Android
        //we don't need it in this example but in a real app most likely i'ts needed
        // e.g = when using Room library
    }


    @Test
    fun givenTextMatchesResourceText_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = testingComponent.compareGivenTextToResourceText(context, R.string.app_name, "Testing_playground")
        assertThat(result).isTrue()
    }

    @Test
    fun givenTextMatchesResourceText_returnsWhatever(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = testingComponent.compareGivenTextToResourceText(context, R.string.app_name, "something else")
        assertThat(result).isFalse()
    }


}