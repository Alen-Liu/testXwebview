package com.example.testxwebview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/**
 * @author Alen
 **/
public class CommonWebActivity extends AppCompatActivity {
    WebView wvCommonWeb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wvCommonWeb = findViewById(R.id.wv_common_web);

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        wvCommonWeb.loadUrl("https://720yun.com/t/b6ajr74wvO8?scene_id=28413736");
        //wvCommonWeb.loadUrl("https://www.baidu.com");

        //wvCommonWeb.loadUrl("http://debugx5.qq.com");
        //wvCommonWeb.loadUrl("http://soft.imtt.qq.com/browser/tes/feedback.html");
        //http://debugtbs.qq.com
    }

    private void initView() {
        Log.i("test","是否已经加载了X5内核" + (wvCommonWeb.getX5WebViewExtension() == null));
        wvCommonWeb.getSettings().setJavaScriptEnabled(true);
        wvCommonWeb.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                wvCommonWeb.loadUrl(request.getUrl().toString());
                return true;
            }
        });
        wvCommonWeb.setARModeEnable(true);
        wvCommonWeb.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedTitle(WebView view, String title) {
            }
        });
    }

}
