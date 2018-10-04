package com.titantech.watchdog1023.myunisa;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {
    public boolean shouldoverrideURLloading(WebView view, String url) {
        if (Uri.parse(url).getHost().endsWith("https://my.unisa.ac.za/portal/xlogin")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}