package com.keuangan.harian

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web = findViewById<WebView>(R.id.web)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        web.loadUrl("file:///android_asset/index.html")
    }

    override fun onBackPressed() {
        val web = findViewById<WebView>(R.id.web)
        if (web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}
