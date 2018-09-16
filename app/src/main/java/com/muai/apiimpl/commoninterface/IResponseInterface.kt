package com.muai.apiimpl.commoninterface

import android.telecom.Call

interface IResponseInterface {

    fun callApi(call: Call, requestType: String)

}