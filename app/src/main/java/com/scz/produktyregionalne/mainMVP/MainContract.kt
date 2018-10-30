package com.scz.produktyregionalne.mainMVP

interface MainContract {
    interface MvpView {
        fun initView()
        fun showCategories(categories: ArrayList<String>)
    }

    interface Presenter {
        fun initPresenter()
        fun loadProducts(which: String)
        fun onClickCategories()
    }

    interface Model {
        fun downloadProducts(which: String)
        fun categories(): ArrayList<String>
    }
}
