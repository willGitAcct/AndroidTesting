package com.example.androidtesting

import org.junit.Assert.*
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class RegUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegUtil.validateRegInput(
            username ="",
            password= "123",
            confirmedPW = "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correct passwords returns true`(){
        val result = RegUtil.validateRegInput(
            username ="Timo",
            password= "1234",
            confirmedPW = "1234"
        )
        assertThat(result).isTrue()

    }

    //should fail
    @Test
    fun `username exists and returns false`(){
        val result = RegUtil.validateRegInput(
            username ="Tim",
            password= "123",
            confirmedPW = "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `username but password empty returns false`(){
        val result = RegUtil.validateRegInput(
            username ="Carla",
            password= "",
            confirmedPW = ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `username but passwords dont match returns false`(){
        val result = RegUtil.validateRegInput(
            username ="Carla",
            password= "123",
            confirmedPW = "122"
        )
        assertThat(result).isFalse()

    }

}