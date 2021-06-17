package com.satria.jpro.secondsubmission.viewmodel
//copyright satria junanda//
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.satria.jpro.secondsubmission.data.source.CatalogRepository
import com.satria.jpro.secondsubmission.di.Injection
import com.satria.jpro.secondsubmission.ui.detail.DetailViewModel
import com.satria.jpro.secondsubmission.ui.home.HomeViewModel

class ViewModelFactory private constructor(private val mCatalogRepository: CatalogRepository): ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideCatalogRepository())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(mCatalogRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(mCatalogRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}


//copyright satria junanda//