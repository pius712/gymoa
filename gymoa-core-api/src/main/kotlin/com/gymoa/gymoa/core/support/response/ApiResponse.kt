package com.gymoa.gymoa.core.support.response

class ApiResponse<T>(
    val result: ApiResult,
    val data: T? = null,
    val error: Any? = null
) {

    companion object {
        fun ok(): ApiResponse<Unit> {
            return ApiResponse(ApiResult.SUCCESS)
        }

        fun <T> ok(data: T): ApiResponse<T> {
            return ApiResponse(ApiResult.SUCCESS, data)
        }

        fun error(error: Any?): ApiResponse<Unit> {
            return ApiResponse(ApiResult.ERROR, null, error)
        }
    }
}