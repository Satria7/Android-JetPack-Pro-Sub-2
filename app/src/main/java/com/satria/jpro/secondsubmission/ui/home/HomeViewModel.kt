package com.satria.jpro.secondsubmission.ui.home
//copyright satria junanda//
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.satria.jpro.secondsubmission.data.DataModel
import com.satria.jpro.secondsubmission.data.source.CatalogRepository

class HomeViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getListNowPlayingMovies(): LiveData<List<DataModel>> = catalogRepository.getNowPlayingMovies()

    fun getListOnTheAirTvShows(): LiveData<List<DataModel>> = catalogRepository.getTvShowOnTheAir()

}

//copyright satria junanda//