package com.satria.jpro.secondsubmission.data.source.remote.api

import com.satria.jpro.secondsubmission.BuildConfig
import com.satria.jpro.secondsubmission.data.source.remote.response.ListResponse
import com.satria.jpro.secondsubmission.data.source.remote.response.MovieResponse
import com.satria.jpro.secondsubmission.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
//copyright satria junanda//
interface ApiService {

    @GET("movie/now_playing")
    fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<ListResponse<MovieResponse>>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<MovieResponse>

    @GET("tv/on_the_air")
    fun getTvShowOnTheAir(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<ListResponse<TvShowResponse>>

    @GET("tv/{tv_id}")
    fun getDetailTvShow(
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<TvShowResponse>

}


//copyright satria junanda//