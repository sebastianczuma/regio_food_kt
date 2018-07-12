package com.scz.produktyregionalne.mainMVP

interface MainContract {
    interface MvpView {
        fun initView()
        fun showCategories(categories: ArrayList<String>)
    }

    interface Presenter {
        fun initPresenter()
        fun loadItems(): ArrayList<String>
        fun onClickCategories()
    }

    interface Model {
        fun items(): ArrayList<String>
        fun categories(): ArrayList<String>
        fun provincesQuantity(): ArrayList<String>
        fun provinces(): ArrayList<String>
    }
}