package repository

import AuthRepository
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import mappers.verifyEmail.toVerifyEmailReceiveModel
import mappers.verifyEmail.toVerifyEmailRespondDataModel
import models.ApiModel
import models.ErrorDataModel
import models.sendOneTimePassword.SendOneTimePasswordReceiveDataModel
import models.sendOneTimePassword.SendOneTimePasswordReceiveModel
import models.sendOneTimePassword.SendOneTimePasswordRespondModel
import models.verifyEmail.VerifyEmailReceiveDataModel
import models.verifyEmail.VerifyEmailReceiveModel
import models.verifyEmail.VerifyEmailRespondModel

class AuthRepositoryImpl(private val client: HttpClient) : AuthRepository {
    override suspend fun verifyEmail(verifyEmailRespondModel: VerifyEmailRespondModel): ApiModel<VerifyEmailReceiveModel> {
        val result = client.post("/api/v1/auth/verify_email") {
            setBody(verifyEmailRespondModel.toVerifyEmailRespondDataModel())
        }
        return when (result.status) {
            HttpStatusCode.OK -> {
                ApiModel.Success(result.body<VerifyEmailReceiveDataModel>().toVerifyEmailReceiveModel())
            }

            HttpStatusCode.BadRequest -> {
                ApiModel.Error(result.body<ErrorDataModel>().message, result.status.value)
            }

            else -> {
                ApiModel.Error(result.body<ErrorDataModel>().message, result.status.value)
            }
        }
    }

    override suspend fun sendOneTimePassword(sendOneTimePasswordRespondModel: SendOneTimePasswordRespondModel): ApiModel<SendOneTimePasswordReceiveModel> {
        // Response
        return TODO()
    }
}