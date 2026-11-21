package models.sendOneTimePassword

import kotlin.uuid.Uuid

data class SendOneTimePasswordReceiveModel(
    val isNew: Boolean, val sessionToken: Uuid
)
