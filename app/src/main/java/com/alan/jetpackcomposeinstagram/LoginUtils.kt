package com.alan.jetpackcomposeinstagram

import android.util.Patterns

fun enableLogin(email: String, password: String): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6
}
