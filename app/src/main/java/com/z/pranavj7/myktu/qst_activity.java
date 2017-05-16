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
public class qst_activity extends DetailQuestionsactivitys1s2 {
    private WebView wv1;
    private ProgressBar mLoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qst_activity);
        String url = null;
        mLoadingBar = (ProgressBar) findViewById(R.id.loading);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        mLoadingBar.setVisibility(View.VISIBLE);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        wv1 = (WebView) findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());



        switch (act) {

            case "icps":
                switch (pj) {
                    case "q1":
                        //** intro to computing and problem solving -1 january 2016 */
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPbUpJTGl6NVY0VkE/view?usp=sharing";
                        break;
                    case "q2":
                        //** intro to computing and problem solving -1 june 2016 */
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPUjIxVEtIREpVMFE/view?usp=sharing";
                        break;
                    case "q3":
                        //** intro to computing and problem solving -1 january 2017 */
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPLVh0a0ZIbGtWUm8/view?usp=sharing";
                        break;
                }
                break;

            case "bee":
                switch (pj) {
                    case "q1":
                        //** basics of electrical january 2016 */
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPMnZDTExGbWd0ZUE/view?usp=sharing";
                        break;
                    // july 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPMnZDTExGbWd0ZUE/view?usp=sharing";
                        break;
                    case "q3":
                        url = null;
                        break;
                }
                break;

            case "ise":
                switch (pj) {
                    case "q1":
                        //** intro to sustainable - 1 january 2016 */
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWOExDaFBWenNhU2ozQ0R3VjNFSWFRSF9WZF9v/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":

                        url =null;
                        break;
                }
                break;

            case "bec":
                switch (pj) {
                    case "q1":
                        //** basics of electronics - 1 january 2016 */
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPajRod3VPVzdibVE/view?usp=sharing";
                        break;
                    //** basics of electronics - may/june 2016 */
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPbHFxcVFCVVdFYzQ/view?usp=sharing";
                        break;
                    //** basics of electronics - july 2016 */
                    case "q3":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPT2RpMHNWX0IyWFk/view?usp=sharing";
                        break;
                    //** basics of electronics - january 2017 */
                    case "q4":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPMjVjbE8tT1NFOTg/view?usp=sharing";
                        break;
                }
                break;

            case "gpy":
                switch (pj) {
                    case "q1":
                        //** graphics january 2016
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPY2xsUlNTMkotUnM/view?usp=sharing";
                        break;
                    case "q2":
                        //** graphics july 2016
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPNDlZSWpFU0NpSlE/view?usp=sharing";
                        break;
                    case "q3":
                        //** graphics september 2016
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPNDlZSWpFU0NpSlE/view?usp=sharing";
                        break;
                         //graphics jan 2017
                    case "q4":
                    url ="https://drive.google.com/file/d/0B6lGlvIUlFgPTnpSM1YwMkpsZW8/view?usp=sharing";
                }
                break;
            case "phy":
                switch (pj) {
                    // physics jan 2016
                    case "q1":
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWOWRxZUdMWDNfaWM/view?usp=sharing" ;
                        break;
                    //june 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWUkZKSnhOQmJTOGc/view?usp=sharing";
                        break;
                    //july 2016
                    case "q3":
                        url ="https://drive.google.com/file/d/0B1IiXR4DjQkWSFowRVVPTXZkN0E/view?usp=sharing";
                        break;
                    //august 2016
                    case "q4":
                        url ="https://drive.google.com/file/d/0B1IiXR4DjQkWeUM4YmstVWVZOFU/view?usp=sharing";
                        break;
                    //jan 2017
                    case "q5":
                        url ="https://drive.google.com/file/d/0B1IiXR4DjQkWeUM4YmstVWVZOFU/view?usp=sharing";
                        break;
                }
                break;
            case "chem":
                switch (pj) {
                    case "q1":
                        //** chemistry 2 may/june 2016 **//
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWNnRNei02OU1aNkJvdXY5OUppUEZXaHNpZjRn/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "cal":
                switch (pj) {
                    case "q1":
                        /** Calculus january 2016---------------------------------*/
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWalMya0RYU2dUeUc2QnNYUTdnZXVVS2lYTXJj/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "des":
                switch (pj) {
                    case "q1":
                        //** desgin and engineering 1 - may june 2016 ** //
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPM3I2aHpQUS1vdzg/view?usp=sharing";
                        break;
                    case "q2":
                        //des july 2016
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPd0VsNmxPRUFiM0k/view?usp=sharing";
                        break;
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "diff":
                switch (pj) {
                    case "q1":
                        //** differential equation may/june 1 2016 ***//
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWOXUwcDZNNDlaeVlFSV9KQkdabmIwY2d0djRj/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url:
                        break;
                }
                break;
            case "bme":
                switch (pj) {
                    case "q1":
                        // basics of mechanical engineering july 2016**//
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPR01tV3hVd2JWZU0/view?usp=sharing";
                        break;
                    case "q2":
                        //basics mech jan 2017
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPRVp6NW42R1Rnb0E/view?usp=sharing";
                        break;
                    case "q3":
                        url = null;
                        break;
                }
                break;
            case "bcivil":
                switch (pj) {
                    //**** basics of civil enginering 1 MAY  / june 2016**/
                    case "q1":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPajBjOGNsTG1rTmM/view?usp=sharing";
                        break;
                    // july 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPZFlVYjJSR0pnNkE/view?usp=sharing";
                        break;
                    //jan 2017
                    case "q3":
                        url="https://drive.google.com/file/d/0B6lGlvIUlFgPQWxVSkcyMW1KTHM/view?usp=sharing";
                        break;
                }
                break;
            case "mech":
                switch (pj) {
                    case "q1":
                        //** mechanics june 2016***********************************//
                         url = "https://drive.google.com/file/d/0B6lGlvIUlFgPSlRab2otWmVzSzg/view?usp=sharing";
                        break;
                    // july 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPU2NyRW9jaloyU0k/view?usp=sharing";
                        break;
                    // jan 2017
                    case "q3":
                        url="https://drive.google.com/file/d/0B6lGlvIUlFgPNzk5NTZEbWZYS2M/view?usp=sharing";
                        break;
                }
                break;
            case "ime":
                switch (pj) {
                    case "q1":
                        //** intro to mechanical jan 2016***********************************//
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPdXZjOVVTVEJFcUU/view?usp=sharing";
                        break;
                    // june 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPX3RCZHg5Y0xPWFE/view?usp=sharing";
                        break;
                    // jan 2017
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "iee":
                switch (pj) {
                    case "q1":
                        //** intro to electrical jan 2016***********************************//
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPcGxkODZ5M3lnM28/view?usp=sharing";
                        break;
                    // june 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPNWhFS1FUbTktbm8/view?usp=sharing/";
                        break;
                    // jan 2017
                    case "q3":
                        url="https://drive.google.com/file/d/0B6lGlvIUlFgPNWhFS1FUbTktbm8/view?usp=sharing";
                        break;
                }
                break;

            case "iec":
                switch (pj) {
                    case "q1":
                        //** intro to electronics jan 2016***********************************//
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPUGM5RWtCYTFUbTg/view?usp=sharing";
                        break;
                    // june 2016
                    case "q2":
                        url = "https://drive.google.com/file/d/0B6lGlvIUlFgPTjY2NWxtb2VfWEU/view?usp=sharing";
                        break;
                    // jan 2017
                    case "q3":
                        url="https://drive.google.com/file/d/0B6lGlvIUlFgPVlRIc0VJbHpUM2M/view?usp=sharing";
                        break;
                }
                break;

            default:
                break;
        }

        WebView st = (WebView) findViewById(R.id.webView);
        st.getSettings().setJavaScriptEnabled(true);
        st.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        st.loadUrl(url);


    }

    public class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            mLoadingBar.setVisibility(View.VISIBLE);

            return true;
        }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mLoadingBar.setVisibility(View.GONE);
            }


    }
}

