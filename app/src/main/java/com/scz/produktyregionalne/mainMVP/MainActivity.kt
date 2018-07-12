package com.scz.produktyregionalne.mainMVP

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import com.scz.produktyregionalne.R
import com.scz.produktyregionalne.recyclerViews.RvAll
import com.scz.produktyregionalne.recyclerViews.RvCategories
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.categories.view.*

class MainActivity : AppCompatActivity(), MainContract.MvpView {
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainPresenter(this)
        mPresenter.initPresenter()

        categories.setOnClickListener {
            mPresenter.onClickCategories()
        }
    }

    override
    fun initView() {
        top.text = intent.getStringExtra("province")

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = RvAll(mPresenter.loadItems(), this)
    }

    override fun showCategories(categories: ArrayList<String>) {
        val provincesDialogView = LayoutInflater.from(this).inflate(R.layout.categories, recycler_view, false)
        val builder = AlertDialog.Builder(this)
                .setView(provincesDialogView)
                .setTitle("Kategorie")
                .setPositiveButton("Ok") { _, _ ->
                }
                .setNegativeButton("Anuluj") { _, _ ->
                }
        builder.show()

        provincesDialogView.recycler_view2.layoutManager = LinearLayoutManager(this)
        provincesDialogView.recycler_view2.adapter = RvCategories(categories, this)
    }
}
