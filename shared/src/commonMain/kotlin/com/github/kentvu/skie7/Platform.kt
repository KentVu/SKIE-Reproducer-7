package com.github.kentvu.skie7

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform