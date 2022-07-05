package io.github.ferhatwi.supabase

object Supabase {

    lateinit var PROJECT_ID: String
    lateinit var API_KEY: String
    lateinit var AUTHORIZATION: String

    fun initialize(projectID: String, apiKey: String) {
        PROJECT_ID = projectID
        API_KEY = apiKey
        AUTHORIZATION = apiKey
    }

    fun setAuth(authorization: String) {
        AUTHORIZATION = authorization
    }

    fun clearAuth() {
        AUTHORIZATION = API_KEY
    }
}