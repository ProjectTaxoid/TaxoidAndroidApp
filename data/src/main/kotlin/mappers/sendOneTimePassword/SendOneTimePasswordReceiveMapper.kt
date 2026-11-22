package mappers.sendOneTimePassword

import models.sendOneTimePassword.SendOneTimePasswordReceiveDataModel
import models.sendOneTimePassword.SendOneTimePasswordReceiveModel

fun SendOneTimePasswordReceiveModel.toSendOneTimePasswordReceiveDataModel(): SendOneTimePasswordReceiveDataModel =
    SendOneTimePasswordReceiveDataModel(
        isNew = isNew, sessionToken = sessionToken
    )

fun SendOneTimePasswordReceiveDataModel.toSendOneTimePasswordReceiveModel(): SendOneTimePasswordReceiveModel =
    SendOneTimePasswordReceiveModel(
        isNew = isNew, sessionToken = sessionToken
    )