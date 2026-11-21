package models.sendOneTimePassword

import kotlin.uuid.Uuid

data class SendOneTimePasswordRespondModel(
    val registrationSessionId: Uuid,
    val code: String
)
