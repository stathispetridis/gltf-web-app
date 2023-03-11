package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);//Link activity to view


        //Initialize webView and link id to .xml file
        WebView web = (WebView) findViewById(R.id.webview);
        //set setting to webView
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setAllowFileAccess(true);
        //load html page
        web.loadUrl("file:///android_asset/glTF viewer.html");

    }

}