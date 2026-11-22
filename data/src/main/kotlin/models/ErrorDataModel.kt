package models

import kotlinx.serialization.Serializable

@Serializable
data class ErrorDataModel(
    val message: String
)
