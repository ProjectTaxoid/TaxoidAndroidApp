package mappers.verifyEmail

import models.verifyEmail.VerifyEmailReceiveDataModel
import models.verifyEmail.VerifyEmailReceiveModel

fun VerifyEmailReceiveModel.toVerifyEmailReceiveDataModel(): VerifyEmailReceiveDataModel = VerifyEmailReceiveDataModel(
    registrationSessionId = registrationSessionId
)

fun VerifyEmailReceiveDataModel.toVerifyEmailReceiveModel(): VerifyEmailReceiveModel = VerifyEmailReceiveModel(
    registrationSessionId = registrationSessionId
)