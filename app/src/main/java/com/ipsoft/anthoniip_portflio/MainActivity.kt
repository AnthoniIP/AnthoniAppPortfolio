package com.ipsoft.anthoniip_portflio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewImp = WebViewImp(this)

        mainWebView.webViewClient = webViewImp


        mainWebView.loadUrl("https://anthoniip.github.io")

        // Deixando funcionar o javascript na página
        val webSettings = mainWebView.settings
        webSettings.javaScriptEnabled = true

    }
    override fun onBackPressed() {
        mainWebView.goBack()
    }
}