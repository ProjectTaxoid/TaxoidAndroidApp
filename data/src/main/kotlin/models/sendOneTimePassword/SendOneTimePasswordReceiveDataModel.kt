package models.sendOneTimePassword

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.uuid.Uuid

@Serializable
data class SendOneTimePasswordReceiveDataModel(
    @SerialName("is_new") val isNew: Boolean,
    @SerialName("session_token") val sessionToken: Uuid
)
