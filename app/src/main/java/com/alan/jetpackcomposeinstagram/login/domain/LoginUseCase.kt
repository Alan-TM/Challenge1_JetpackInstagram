package com.alan.jetpackcomposeinstagram.login.domain

import com.alan.jetpackcomposeinstagram.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}
