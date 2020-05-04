package com.know.ourcountries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.know.ourcountries.model.Country


class ListViewModel : ViewModel() {

    // TODO 4: write live data for countries list, loading state and error
    val countries = MutableLiveData<List<Country>>()
    val progress = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        //TODO 5: make retrofit api call to get data and handle success and error.

    }

    private fun onError(message: String) {
        // TODO 6: update error and other states if api call gives error.
    }

    override fun onCleared() {
        super.onCleared()
    }

}