package dev.jamieastley.kmm_template

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform