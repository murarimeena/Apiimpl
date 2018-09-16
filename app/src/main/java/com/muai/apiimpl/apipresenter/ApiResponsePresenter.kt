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
            fun onResponse(response: Response, retrofit: Retrofit) {
                iResponseInterface.onResponseSuccess(response, reqType)
                throwable.printStackTrace()
                    iResponseInterface.onResponseFailure("Response Failed")
            }

            fun onFailure(throwable: Throwable) {
                if (throwable is ConnectException) {
                    iResponseInterface.onResponseFailure("No Internet Connection")
                    iResponseInterface.onResponseSuccess(response, reqType)
                } else {
                    throwable.printStackTrace()
                    iResponseInterface.onResponseFailure("Response Failed")
                }
            }
        })
    }
}
