package com.example.webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webviewVariable = findViewById<WebView>(R.id.webView)
        webViewSetUp(webviewVariable)

    }

    private fun webViewSetUp(webview: WebView){
        webview.webViewClient = WebViewClient()
        webview.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://prao.com/")
        }
    }
}