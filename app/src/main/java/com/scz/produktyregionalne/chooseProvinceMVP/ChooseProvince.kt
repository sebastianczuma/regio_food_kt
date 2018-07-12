package com.scz.produktyregionalne.chooseProvinceMVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.scz.produktyregionalne.R
import com.scz.produktyregionalne.recyclerViews.RvProvinces
import kotlinx.android.synthetic.main.activity_choose_province.*

class ChooseProvince : AppCompatActivity(), CPContract.MvpView {
    lateinit var mPresenter: CPPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_province)

        mPresenter = CPPresenter(this)
        mPresenter.initPresenter()
    }

    override fun initView() {
        recycler_view.layoutManager = GridLayoutManager(this, 2)
        recycler_view.adapter = RvProvinces(mPresenter.loadProvinces(), this)
    }
}
