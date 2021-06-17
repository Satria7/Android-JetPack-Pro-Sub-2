package com.satria.jpro.secondsubmission.di

import com.satria.jpro.secondsubmission.data.source.CatalogRepository
import com.satria.jpro.secondsubmission.data.source.remote.RemoteDataSource

object Injection {

    fun provideCatalogRepository(): CatalogRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return CatalogRepository.getInstance(remoteDataSource)
    }
}