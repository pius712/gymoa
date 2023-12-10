package com.gymoa.gymoa.core.support.error

class CoreApiException(
    errorType: ErrorType
) : RuntimeException(errorType.message)