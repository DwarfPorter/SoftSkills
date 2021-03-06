package com.example.softskills

sealed class AppState {
    data class Default(val data: String?): AppState()
    data class Success(val data: String?): AppState()
    data class Error(val error: Throwable): AppState()
    data class Loading(val progress: Int?): AppState()
}