package com.febi.uts_18090079.activity.data_barang.presenter

import com.febi.uts_18090079.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}