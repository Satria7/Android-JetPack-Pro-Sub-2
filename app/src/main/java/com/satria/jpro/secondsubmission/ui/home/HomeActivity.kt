package com.satria.jpro.secondsubmission.ui.home
//copyright satria junanda//
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.satria.jpro.secondsubmission.R
import com.satria.jpro.secondsubmission.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_home.*
//copyright satria junanda//
class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val factory = ViewModelFactory.getInstance()
        viewModel = ViewModelProvider(
            this@HomeActivity,
            factory
        )[HomeViewModel::class.java]

        setupToolbar()
        setupViewPager()
    }

    private fun setupToolbar() {
        setSupportActionBar(main_toolbar)
        supportActionBar?.elevation = 0f
        supportActionBar?.title = resources.getString(R.string.app_name)
    }

    private fun setupViewPager() {
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        main_view_pager.adapter = sectionsPagerAdapter
        main_tablayout.setupWithViewPager(main_view_pager)
    }
}
//copyright satria junanda//