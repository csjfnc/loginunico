package com.wareline.login

interface JWTInterface{

    fun onSucceesJwt(jwt: String)
    fun onErrorJwt(error: String)

}