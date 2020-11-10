package com.mahesaiqbal.tourismapp.core.domain.usecase

import com.mahesaiqbal.tourismapp.core.data.Resource
import com.mahesaiqbal.tourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}