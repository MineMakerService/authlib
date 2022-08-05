package io.github.minemakerservice.authlib.legacy

import io.github.minemakerservice.authlib.AuthLib

class Auth {

    fun isVerified(id: Long): Boolean {
        return AuthLib.isVerified(id)
    }

}