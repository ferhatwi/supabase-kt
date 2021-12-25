package io.github.ferhatwi.supabase

object Supabase {

    internal lateinit var API: String

    fun initialize(api: String) {
        API = api
    }

}