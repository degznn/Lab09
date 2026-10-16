package com.example.lab09.data

import com.google.gson.annotations.SerializedName

/**
 * Modelo que representa una publicación obtenida desde el endpoint /posts.
 */
data class PostModel(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String,
    @SerializedName("link") val link: String? = null,
    @SerializedName("comment_count") val commentCount: Int? = null
)
