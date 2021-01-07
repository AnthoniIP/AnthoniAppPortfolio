package com.ipsoft.anthoniip_portflio

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    AnthoniIP - Portfólio
 *  Date:       07/01/2021
 */


class WebViewImp(activity: Activity) : WebViewClient() {

    private var activity: Activity? = null

    init {
        this.activity = activity
    }
    override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
        if (url.contains("https://anthoniip.github.io")) return false
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity!!.startActivity(intent)
        return true
    }
}