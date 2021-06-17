package com.satria.jpro.secondsubmission.ui.home.content.tvshow
//copyright satria junanda//
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.satria.jpro.secondsubmission.R
import com.satria.jpro.secondsubmission.data.DataModel
import com.satria.jpro.secondsubmission.ui.detail.DetailActivity
import com.satria.jpro.secondsubmission.ui.home.HomeViewModel
import com.satria.jpro.secondsubmission.ui.home.content.DataAdapter
import com.satria.jpro.secondsubmission.ui.home.content.DataCallback
import com.satria.jpro.secondsubmission.utils.Helper.TYPE_TVSHOW
import com.satria.jpro.secondsubmission.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_tv_show.*

class TvShowFragment : Fragment(), DataCallback {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupRecyclerView()
        val factory = ViewModelFactory.getInstance()
        activity?.let {
            viewModel = ViewModelProvider(
                it,
                factory
            )[HomeViewModel::class.java]
        }

        viewModel.getListOnTheAirTvShows().observe(viewLifecycleOwner, Observer { listTvShow ->
            rv_tvshow.adapter.let { adapter ->
                when (adapter) {
                    is DataAdapter -> adapter.setData(listTvShow)
                }
            }
        })

    }

    private fun setupRecyclerView() {
        rv_tvshow.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = DataAdapter(this@TvShowFragment)
        }
    }

    override fun onItemClicked(data: DataModel) {
        startActivity(
            Intent(
                context,
                DetailActivity::class.java
            )
                .putExtra(DetailActivity.EXTRA_DATA, data.id)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_TVSHOW)
        )
    }

}
//copyright satria junanda//