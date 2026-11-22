package models.sendOneTimePassword

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.uuid.Uuid

@Serializable
data class SendOneTimePasswordRespondDataModel(
    @SerialName("id")
    val registrationSessionId: Uuid,
    val code: String
)
