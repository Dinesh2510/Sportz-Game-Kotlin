package com.app.sportsappkotlin.Adapter

import android.view.View


interface AdapterClickListener {
    fun onItemClick(view: View?, pos: Int, obj: Any?)
}