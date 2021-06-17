package com.satria.jpro.secondsubmission.ui.detail
//copyright satria junanda//
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.satria.jpro.secondsubmission.data.DataModel
import com.satria.jpro.secondsubmission.data.source.CatalogRepository

class DetailViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getMovieDetail(movieId: Int): LiveData<DataModel> =
        catalogRepository.getMovieDetail(movieId)

    fun getTvShowDetail(tvShowId: Int): LiveData<DataModel> = catalogRepository.getTvShowDetail(
        tvShowId
    )
}


//copyright satria junanda//