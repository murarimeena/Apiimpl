/*********************************************************
 * NetworkStatus helps us to check the Internet connection
 * state of our handheld device.**************************
 */
package com.muai.apiimpl.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.util.Log
import android.widget.Toast

object NetworkStatus {
    private var instance: NetworkStatus? = null

    fun isOnline2(context: Context?): Boolean {
        var context = context
        var connected = false
        try {
            val connectivityManager = context!!.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connectivityManager.activeNetworkInfo
            connected = networkInfo != null && networkInfo.isAvailable && networkInfo.isConnected
            context = null
            return connected
        } catch (e: Exception) {
            Log.v("connectivity", e.toString())
        }

        return connected
    }

}
