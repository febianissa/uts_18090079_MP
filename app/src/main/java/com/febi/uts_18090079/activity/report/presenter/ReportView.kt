package com.febi.uts_18090079.activity.report.presenter

import com.febi.uts_18090079.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}