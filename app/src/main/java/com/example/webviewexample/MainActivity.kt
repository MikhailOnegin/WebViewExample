package com.example.webviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var wV:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wV = webView
        wV.settings.javaScriptEnabled = true

        webView.loadUrl("https://youtube.com")
        val vWClient = WebViewClient()
        wV.webViewClient = vWClient

    }
}