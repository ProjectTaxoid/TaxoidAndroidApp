package models.verifyEmail

import kotlin.uuid.Uuid

data class VerifyEmailReceiveModel(
    val registrationSessionId: Uuid
)