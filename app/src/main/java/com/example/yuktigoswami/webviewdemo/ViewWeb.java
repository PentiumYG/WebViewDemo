package com.example.yuktigoswami.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewWeb extends AppCompatActivity {
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);
        w=(WebView)findViewById(R.id.bt);

       // w.loadUrl("https://www.google.co.in/");

        w.getSettings().setJavaScriptEnabled(true); //to make it work fast and ignore java code.
        w.setWebViewClient(new HelloWebViewClient());

        w.loadUrl("https://www.google.co.in/");
    }

    private class HelloWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}
