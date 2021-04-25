package com.febi.uts_18090079.activity.login

import com.febi.uts_18090079.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}