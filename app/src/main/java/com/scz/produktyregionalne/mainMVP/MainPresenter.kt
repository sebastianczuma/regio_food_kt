package com.scz.produktyregionalne.mainMVP

class MainPresenter(view: MainContract.MvpView) : MainContract.Presenter {
    var mView: MainContract.MvpView = view
    var mModel: MainContract.Model = MainModel()

    override fun initPresenter() {
        mView.initView()
    }

    override fun loadProducts(which: String) {
        val newWhich = which.replace("ą", "a")
                .replace("ć", "c")
                .replace("ę", "e")
                .replace("ł", "l")
                .replace("ń", "n")
                .replace("ó", "o")
                .replace("ś", "s")
                .replace("ż", "z")
                .replace("ź", "z")
        mModel.downloadProducts(newWhich)
    }

    override fun onClickCategories() {
        mView.showCategories(mModel.categories())
    }
}