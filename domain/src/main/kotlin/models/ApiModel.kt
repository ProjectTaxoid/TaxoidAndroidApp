package models

sealed interface ApiModel<out S> {
    data class Success<S>(val value: S) : ApiModel<S>
    data class Error(val message: String, val code: Int) : ApiModel<Nothing>
}