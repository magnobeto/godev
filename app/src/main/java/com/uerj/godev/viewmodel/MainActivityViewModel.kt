package com.uerj.godev.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uerj.godev.model.Language

class MainActivityViewModel : ViewModel() {

    private val languageSelectedLV: MutableLiveData<Language> = MutableLiveData()
    val languageSelected: LiveData<Language> = languageSelectedLV

    fun setLanguageSelected(language: Language) {
        languageSelectedLV.value = language
    }
}