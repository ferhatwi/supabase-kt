package io.github.ferhatwi.supabase


internal lateinit var API: String

object Supabase {

    fun initialize(api: String) {
        API = api
    }

}