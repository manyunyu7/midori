package com.manyunyu7.lib

import android.util.Log


class LibDebug {
    companion object Builder {
        private const val TAG = "LIB_EXAMPLE_ANDROID"

        fun i(message:String){
            Log.i(TAG, message)
        }
    }
}