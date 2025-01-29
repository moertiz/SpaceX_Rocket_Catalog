package com.maramayo.spacexrocketcatalog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform