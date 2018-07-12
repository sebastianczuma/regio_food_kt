package com.scz.produktyregionalne.mainMVP

class MainPresenter(view : MainContract.MvpView) : MainContract.Presenter {
    var mView: MainContract.MvpView = view
    var mModel: MainContract.Model = MainModel()

    override fun initPresenter() {
        mView.initView()
    }

    override fun loadItems(): ArrayList<String> {
        return mModel.items()
    }

    override fun onClickCategories() {
        mView.showCategories(mModel.categories())
    }

}