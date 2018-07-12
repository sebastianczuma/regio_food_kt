package com.scz.produktyregionalne.chooseProvinceMVP

interface CPContract {
    interface MvpView {
        fun initView()
    }

    interface Presenter {
        fun initPresenter()
        fun loadProvinces(): ArrayList<String>
    }

    interface Model {
        fun provinces(): ArrayList<String>
    }
}