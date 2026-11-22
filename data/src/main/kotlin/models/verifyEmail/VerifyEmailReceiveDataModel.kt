package models.verifyEmail

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.uuid.Uuid

@Serializable
data class VerifyEmailReceiveDataModel(
    @SerialName("id")
    val registrationSessionId: Uuid
)