package com.example.androidtesting

object RegUtil {

    private val users = listOf("Tim", "Carla", "Reginald")
    // not valid i the user/pass is empty, or username taken, or pws dont match

    fun validateRegInput(
        username: String,
        password: String,
        confirmedPW: String
    ): Boolean{

        if(username.isEmpty() || password.isEmpty()){
            return false
        }

        if(username in users){
            return false
        }

        if(password != confirmedPW){
            return false
        }
        return true
    }
}