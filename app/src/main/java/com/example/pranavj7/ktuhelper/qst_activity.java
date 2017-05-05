package com.example.pranavj7.ktuhelper;
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
public class qst_activity extends DetailQactivity {
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
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWSFpyUWRzeHdGd2JiS29KVTVnS3lqYWdrWHNj/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":

                        url =null;
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
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWLWxxdEVJZG55R3pfRFlNVFY5ejNNNGlZa0lZ/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":

                        url:
                        break;
                }
                break;

            case "gpy":
                switch (pj) {
                    case "q1":
                        //** graphics 2 may-june 2016
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWQjhjdkFha0dub0xpdEFHU0tjRGRiRHh0S1V3/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "phy":
                switch (pj) {
                    case "q1":
                        url = null;
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url:
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
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWQ3FkUUlrQ18xajlTblhZcDdrWWNndHpiZmFj/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url:
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
                        // basics of mechanical engineering 1 may/june 2016**//
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWMFhyMVlsSjVFM3l4ZTVJb1ZNUUlHNFBfM3Ew/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
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
                        url = "https://drive.google.com/file/d/0B1IiXR4DjQkWNVJ3ZlRuS21CdjFHb0gwdHN3bE9FSjduZlM4/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url=null;
                        break;
                }
                break;
            case "mech":
                switch (pj) {
                    case "q1":
                        //** mechanics 1 january 2016***********************************//
                         url = "https://drive.google.com/file/d/0B1IiXR4DjQkWUU9jdU5jMk1oVm04Vmo0NFoyTzJjdC0xcVJZ/view?usp=sharing";
                        break;
                    case "q2":
                        url = null;
                        break;
                    case "q3":
                        url=null;
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

