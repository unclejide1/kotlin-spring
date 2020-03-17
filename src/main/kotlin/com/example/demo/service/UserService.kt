package com.example.demo.service

import com.example.demo.model.User

interface UserService {
    fun getUser(name: String): User
    fun addUser(user: User)
    fun updateUser(name: String, user: User)
    fun deleteUser(name: String)
}