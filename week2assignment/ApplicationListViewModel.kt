package com.week2

import androidx.lifecycle.ViewModel

class ApplicationListViewModel(private val repo: ApplicationInfoRepository) : ViewModel() {

    fun getApplicationList() = repo.getDebugApplications()
}
