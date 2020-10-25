package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class VueDemoWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        WebView myWebView = new WebView(getApplicationContext());
        setContentView(myWebView);

        myWebView.loadUrl("https://lixiaochen.github.io/");
    }
}