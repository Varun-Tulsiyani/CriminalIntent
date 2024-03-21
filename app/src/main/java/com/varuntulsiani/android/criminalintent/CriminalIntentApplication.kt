package com.varuntulsiani.android.criminalintent

import android.app.Application
import com.varuntulsiani.android.criminalintent.database.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}