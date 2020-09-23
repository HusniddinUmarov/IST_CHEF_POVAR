package ist.uz.istchef.api

data class BaseResponse<T>(
    val status: Boolean,
    val message: String?,
    val data: T
)