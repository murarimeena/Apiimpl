package com.muai.apiimpl.apipresenter

import android.telecom.Call
import com.muai.apiimpl.commoninterface.IResponseInterface
import java.net.ConnectException
import javax.security.auth.callback.Callback

interface ApiResponsePresenter {

    var iResponseInterface: IResponseInterface

    fun ApiResponsePresenter(iResponseInterface: IResponseInterface): ??? {
        this.iResponseInterface = iResponseInterface
    }

    fun callApi(call: Call, reqType: String) {
        call.enqueue(object : Callback() {
            throwable.printStackTrace()
            iResponseInterface.onResponseFailure("No Internet Connection")
            fun onResponse(response: Response, retrofit: Retrofit) {
                iResponseInterface.onResponseSuccess(response, reqType)
            }

            fun onFailure(throwable: Throwable) {
                if (throwable is ConnectException) {
                    iResponseInterface.onResponseFailure("No Internet Connection")
                } else {
                    throwable.printStackTrace()
                    iResponseInterface.onResponseFailure("Response Failed")
                }
            }
        })
    }
}