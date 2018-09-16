package com.muai.apiimpl.commoninterfaces

import android.view.View

interface IAdapterClickListener {

    fun onAdapterClick(data: Any, pos: Int, view: View)
}
