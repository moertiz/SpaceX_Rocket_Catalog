package com.maramayo.spacexrocketcatalog.models

import kotlinx.serialization.Serializable

@Serializable
data class Rocket(
    val id: String,
    val name: String,
    val description: String,
    val flickr_images: List<String>
)
