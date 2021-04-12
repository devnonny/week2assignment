package com.week2

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager

interface ApplicationInfoRepository {
    fun getDebugApplications(): List<ApplicationInfo>
}

class ApplicationInfoRepositoryImpl(private val packageManager: PackageManager) : ApplicationInfoRepository {

    override fun getDebugApplications(): List<ApplicationInfo> {
        return packageManager.getInstalledApplications(0).filter {
            0 != it.flags and ApplicationInfo.FLAG_DEBUGGABLE
        }
    }
}
