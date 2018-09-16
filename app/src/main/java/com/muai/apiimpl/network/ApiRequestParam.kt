package com.muai.apiimpl.network

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.muai.apiimpl.constants.Constants
import com.muai.apiimpl.utils.MyLogUtils

class ApiRequestParam {

    companion object {

        internal var apiRequestParam: ApiRequestParam? = null
        var TAG = "ApiRequestParam"

        val instance: ApiRequestParam
            get() = if (apiRequestParam == null)
                ApiRequestParam()
            else
                apiRequestParam!!

        private var respParamObj: JsonObject? = null
        private val respParamArrey: JsonArray? = null

        fun dummy(mobile: String): JsonObject {
            try {
                respParamObj = JsonObject()
                respParamObj!!.addProperty(Constants.DUMMY, mobile)
            } catch (exp: Exception) {
                exp.message?.let { MyLogUtils.e(TAG, it) }
            }

            return respParamObj!!
        }

    }
}
