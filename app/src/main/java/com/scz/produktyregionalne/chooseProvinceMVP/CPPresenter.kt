package com.scz.produktyregionalne.chooseProvinceMVP

class CPPresenter(view: CPContract.MvpView) : CPContract.Presenter {
    var mView: CPContract.MvpView = view
    var mModel: CPContract.Model = CPModel()

    override fun initPresenter() {
        mView.initView()
    }

    override fun loadProvinces(): ArrayList<String> {
        return mModel.provinces()
    }
}