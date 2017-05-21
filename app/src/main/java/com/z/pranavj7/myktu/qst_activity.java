package com.z.pranavj7.myktu;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
/**
 * Created by pranavj7 on 7/14/2016.
 */
public class qst_activity extends DetailQuestionActivitys3s4 {
    private WebView wv1;
    private ProgressBar mLoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qst_activity);
        mLoadingBar = (ProgressBar) findViewById(R.id.loading);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        mLoadingBar.setVisibility(View.VISIBLE);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        wv1 = (WebView) findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());


        WebView st = (WebView) findViewById(R.id.webView);
        st.getSettings().setJavaScriptEnabled(true);
        st.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        st.loadUrl(s);


    }

    public class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String s) {
            view.loadUrl(s);
            mLoadingBar.setVisibility(View.VISIBLE);

            return true;
        }
            @Override
            public void onPageFinished(WebView view, String s) {
                super.onPageFinished(view, s);
                mLoadingBar.setVisibility(View.GONE);
            }

    }

}

