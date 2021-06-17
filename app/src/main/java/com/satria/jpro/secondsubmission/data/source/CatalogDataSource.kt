package com.satria.jpro.secondsubmission.data.source
//copyright satria junanda//
import androidx.lifecycle.LiveData
import com.satria.jpro.secondsubmission.data.DataModel

interface CatalogDataSource {

    fun getNowPlayingMovies(): LiveData<List<DataModel>>

    fun getMovieDetail(movieId: Int): LiveData<DataModel>

    fun getTvShowOnTheAir(): LiveData<List<DataModel>>

    fun getTvShowDetail(tvShowId: Int): LiveData<DataModel>

}

//copyright satria junanda//