package com.neppplus.self_apipractice_20220106.utils

import android.content.Context

class ContextUtil {

    companion object {

        val PREF_NAME = "APIPracticePref"

        val TOKEN = "TOKEN"

        fun setToken(context: Context, token : String) {

            val pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            pref.edit().putString(TOKEN, token).apply()
        }
    }
}