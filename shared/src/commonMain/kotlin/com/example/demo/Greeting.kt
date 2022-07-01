package com.example.demo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}