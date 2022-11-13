package com.app.sportsappkotlin.Interface

import com.app.sportsappkotlin.retrofit.Response.ResponseGame

class Presenter {



    interface MainPresenter {
        fun gameData()
        fun created()
        fun onBackPressed()

        interface View {
            fun init()
            fun onGetResult(responseGame: ResponseGame?)
            fun onErrorLoading(message: String?)
            fun hideLoading()
            fun showLoading()
            fun finishApp()
            fun showAppExitInfo()
        }
    }


}