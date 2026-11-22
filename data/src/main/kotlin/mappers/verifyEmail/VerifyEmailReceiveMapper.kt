package mappers.verifyEmail

import models.verifyEmail.VerifyEmailRespondDataModel
import models.verifyEmail.VerifyEmailRespondModel

fun VerifyEmailRespondModel.toVerifyEmailRespondDataModel(): VerifyEmailRespondDataModel = VerifyEmailRespondDataModel(
    email = email
)

fun VerifyEmailRespondDataModel.toVerifyEmailRespondModel(): VerifyEmailRespondModel = VerifyEmailRespondModel(
    email = email
)