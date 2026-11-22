package models.verifyEmail

import kotlinx.serialization.Serializable

@Serializable
data class VerifyEmailRespondDataModel(
    val email: String
)
