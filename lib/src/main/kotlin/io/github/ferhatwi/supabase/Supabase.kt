package io.github.ferhatwi.supabase

lateinit var API: String

object Supabase {

    fun initialize(api: String) {
        API = api
    }

}