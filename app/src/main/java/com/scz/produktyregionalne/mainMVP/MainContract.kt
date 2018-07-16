package com.scz.produktyregionalne.mainMVP

interface MainContract {
    interface MvpView {
        fun initView()
        fun showCategories(categories: ArrayList<String>)
    }

    interface Presenter {
        fun initPresenter()
        fun loadItems()
        fun onClickCategories()
    }

    interface Model {
        fun items()
        fun categories(): ArrayList<String>
    }
}