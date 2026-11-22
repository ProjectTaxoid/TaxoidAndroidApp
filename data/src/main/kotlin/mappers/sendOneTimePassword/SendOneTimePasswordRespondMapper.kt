package mappers.sendOneTimePassword

import models.sendOneTimePassword.SendOneTimePasswordRespondDataModel
import models.sendOneTimePassword.SendOneTimePasswordRespondModel

fun SendOneTimePasswordRespondModel.toSendOneTimePasswordRespondDataModel(): SendOneTimePasswordRespondDataModel =
    SendOneTimePasswordRespondDataModel(
        registrationSessionId = registrationSessionId, code = code
    )

fun SendOneTimePasswordRespondDataModel.toSendOneTimePasswordRespondModel(): SendOneTimePasswordRespondModel =
    SendOneTimePasswordRespondModel(
        registrationSessionId = registrationSessionId, code = code
    )