package repository

import AuthRepository
import models.ApiModel
import models.sendOneTimePassword.SendOneTimePasswordReceiveModel
import models.sendOneTimePassword.SendOneTimePasswordRespondModel
import models.verifyEmail.VerifyEmailReceiveModel
import models.verifyEmail.VerifyEmailRespondModel

class AuthRepositoryImpl : AuthRepository {
    override fun verifyEmail(verifyEmailRespondModel: VerifyEmailRespondModel): ApiModel<VerifyEmailReceiveModel> {
        // Response
        return TODO()
    }

    override fun sendOneTimePassword(sendOneTimePasswordRespondModel: SendOneTimePasswordRespondModel): ApiModel<SendOneTimePasswordReceiveModel> {
        // Response
        return TODO()
    }
}