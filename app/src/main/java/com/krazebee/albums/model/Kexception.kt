package com.past3.ketro.model

open class Kexception(val errorBody: ResponseBody?,
                      message: String?,
                      cause: Throwable?,
                      val statusCode: StatusCode) : Exception(message, cause)