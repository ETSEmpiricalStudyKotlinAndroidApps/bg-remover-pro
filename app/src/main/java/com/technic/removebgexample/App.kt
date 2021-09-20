package com.technic.removebgexample

import android.app.Application
import com.technic.removebg.RemoveBg

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        /**
         * GET YOUR API KEY FROM HERE -> https://www.remove.bg/profile#api-key
         */
        RemoveBg.init("2sByKahRpKVzDgCqJWZbUrpU")
    }
}