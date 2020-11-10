package com.dicoding.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.mahesaiqbal.tourismapp.core.domain.model.Tourism
import com.mahesaiqbal.tourismapp.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

