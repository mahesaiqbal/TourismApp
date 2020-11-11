package com.mahesaiqbal.tourismapp.maps.di

import com.mahesaiqbal.tourismapp.maps.MapsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mapsModule = module {
    viewModel { MapsViewModel(get()) }
}