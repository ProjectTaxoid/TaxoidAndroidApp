import models.ApiModel
import models.sendOneTimePassword.SendOneTimePasswordReceiveModel
import models.sendOneTimePassword.SendOneTimePasswordRespondModel
import models.verifyEmail.VerifyEmailReceiveModel
import models.verifyEmail.VerifyEmailRespondModel

interface AuthRepository {
    fun verifyEmail(verifyEmailRespondModel: VerifyEmailRespondModel): ApiModel<VerifyEmailReceiveModel>
    fun sendOneTimePassword(sendOneTimePasswordRespondModel: SendOneTimePasswordRespondModel):
            ApiModel<SendOneTimePasswordReceiveModel>
}