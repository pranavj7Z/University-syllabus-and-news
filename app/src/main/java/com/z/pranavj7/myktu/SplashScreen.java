package com.z.pranavj7.myktu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class SplashScreen extends AppCompatActivity{
    InterstitialAd mInterstitialAd;
int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
        MobileAds.initialize(this, getString(R.string.banner_ad_unit_id));//banner
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8536273912281952/8991243027");//i
        // Create ad request.
        AdRequest adRequest = new AdRequest.Builder().build();
        // Begin loading your interstitial.
        mInterstitialAd.loadAd(adRequest);
        finish();
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    finish();
                }
            }

            @Override
            public void onAdOpened() {
                finish();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                finish();

            }
        });

    }
}
