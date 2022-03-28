package io.github.ferhatwi.supabase

sealed class State<T> {
    data class Success<T>(val data: T) : State<T>()
    class Loading<T> : State<T>()
    data class Failed<T>(val e: Throwable) : State<T>()
}