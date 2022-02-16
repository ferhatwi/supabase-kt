package io.github.ferhatwi.supabase

object Supabase {

    lateinit var PROJECT_ID: String
    lateinit var API_KEY: String

    fun initialize(projectID: String, apiKey: String) {
        PROJECT_ID = projectID
        API_KEY = apiKey
    }
}