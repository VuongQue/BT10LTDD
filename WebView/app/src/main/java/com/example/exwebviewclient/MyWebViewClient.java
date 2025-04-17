package com.example.exwebviewclient;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        // Mọi URL sẽ được load ngay trong WebView, không mở Chrome
        view.loadUrl(request.getUrl().toString());
        return true;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        Log.d("WebView", "Đang tải trang: " + url);
        // Bạn có thể hiển thị ProgressBar ở đây
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Log.d("WebView", "Trang đã tải xong: " + url);
        // Ẩn ProgressBar nếu có
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        Log.e("WebView", "Lỗi tải trang: " + error.getDescription());
        // Có thể hiển thị 1 layout lỗi
    }
}
