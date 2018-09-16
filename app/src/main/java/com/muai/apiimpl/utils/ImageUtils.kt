package com.muai.apiimpl.utils

import android.content.Context
import android.widget.ImageView
import com.muai.apiimpl.R
import com.muai.apiimpl.network.ApiConstants
import com.muai.apiimpl.utils.CircleImageView
import com.muai.apiimpl.utils.MyLogUtils
import com.squareup.picasso.Picasso

class ImageUtils {
    companion object {

        fun setImageWithPicasso(activityRef: Context, imageView: ImageView, path: String?) {
            if (path != null && path.length > 0) {
                Picasso.get()
                        .load(ApiConstants.BASE_URL_DUMMY + path)
                        .error(R.drawable.loader)
                        .placeholder(R.drawable.loader)
                        .noFade()
                        .into(imageView)

                MyLogUtils.d("Image URL", (ApiConstants.BASE_URL_DUMMY + path))

            }
        }

        fun setCircleImageWithPicasso(activityRef: Context, imageView: ImageView, path: String?) {
            if (path != null && path.length > 0) {
                Picasso.get()
                        .load(path)/// add image Base url
                        .error(R.drawable.loader)
                        .placeholder(R.drawable.loader)
                        .transform(CircleImageView())
                        .noFade()
                        .into(imageView)

            }
        }
    }
}