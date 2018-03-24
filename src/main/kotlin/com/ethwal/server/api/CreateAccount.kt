package com.ethwal.server.api

class CreateAccount {
    var userId: String = ""
    var password: String = ""
    var forceCreate  = false
    // common params
    var key: String? = null // auth key
    var id: String? = null  // request for id
}