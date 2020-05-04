package com.know.ourcountries.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.know.ourcountries.viewmodel.ListViewModel
import com.know.ourcountries.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ListViewModel
    private val countriesAdapter = CountryListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        // start fetching countries data
        viewModel.refresh()

        countriesList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = countriesAdapter
        }

        observeViewModel()
    }

    //TODO 7: Observe view model to update loading state, data or error in UI.
    private fun observeViewModel() {
        // observe list of countries and update adapter method updateCountries()
        //observe error and update TextView list_error
        //Observe progress and update loading_view ProgressBar
//        viewModel.countries.observe(this, Observer {countries ->
//            countries?.let {
//                countriesList.visibility = View.VISIBLE
//                countriesAdapter.updateCountries(it) }
//        })
//
//        viewModel.error.observe(this, Observer { isError ->
//            list_error.visibility = if(isError.isNullOrBlank()) View.GONE else View.VISIBLE
//        })
//
//        viewModel.progress.observe(this, Observer { isLoading ->
//            isLoading?.let {
//                loading_view.visibility = if(it) View.VISIBLE else View.GONE
//                if(it) {
//                    list_error.visibility = View.GONE
//                    countriesList.visibility = View.GONE
//                }
//            }
//        })
    }
}
