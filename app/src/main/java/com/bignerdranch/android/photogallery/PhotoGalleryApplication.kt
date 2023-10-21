package com.bignerdranch.android.photogallery

import android.app.Application
import com.bignerdranch.android.photogallery.PreferencesRepository

class PhotoGalleryApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferencesRepository.initialize(this)
    }
}