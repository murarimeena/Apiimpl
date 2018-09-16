package com.muai.apiimpl.commoninterfaces

import retrofit2.Response

interface IResponseInterface {

    fun <T> onResponseSuccess(call: retrofit2.Call<T>?, response: Response<T>, reqType: String)

    fun <T> onResponseFailure(call: retrofit2.Call<T>?, responseError: Throwable, reqType: String)

}