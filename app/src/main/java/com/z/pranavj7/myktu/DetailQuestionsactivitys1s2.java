package com.z.pranavj7.myktu;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranavj7 on 9/11/2016.
 */
public class DetailQuestionsactivitys1s2 extends s1s2 {
    static String pj = "";
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mSemRef = mRootRef.child("s1s2");
    DatabaseReference mMaterialRef = mSemRef.child("questions");
    DatabaseReference mQuestionsRef = mMaterialRef.child(act);
    public static int TYPE_WIFI = 1;
    public static int TYPE_MOBILE = 2;
    public static int TYPE_NOT_CONNECTED = 0;
    private boolean internetConnected = true;
    private Snackbar snackbar;
    private int hg;
    private CoordinatorLayout coordinatorLayout;
    private ProgressBar mLoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_questions);
        AdView adView = (AdView)findViewById(R.id.adView7);
        mLoadingBar = (ProgressBar) findViewById(R.id.pb);
        mLoadingBar.setVisibility(View.VISIBLE);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.cd);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));

    }

  /**  public void q1(View view)
  {
        pj = "q1";
        repeat();
    }

    public void q2(View view) {
        pj = "q2";
        repeat();
    }

    public void q3(View view) {
        pj = "q3";
        repeat();
    }

    public void q4(View view) {
        pj = "q4";
        repeat();
    }

    public void q5(View view) {
        pj = "q5";
        repeat();
    }

    public void repeat() {
        Intent slideactivity = new Intent(DetailQuestionsactivitys1s2.this, qst_activity.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
**/
    @Override
    public void onStart() {
        super.onStart();

        mQuestionsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot result) {
                List<String> lst = new ArrayList<>(); // Result will be holded Here
                for (DataSnapshot dsp : result.getChildren()) {
                    lst.add(String.valueOf(dsp.getValue())); //add result into array list
                }
                String n = "";
                for (String data : lst) {
                    n = n + "\n\n" + data;
                }
                TextView n1 = (TextView) findViewById(R.id.fire);
                n1.setMovementMethod(LinkMovementMethod.getInstance());
                n1.setText(Html.fromHtml(n));
                mLoadingBar.setVisibility(View.GONE);
                //n1.setText((n));
                //Linkify.addLinks(n1, Linkify.ALL);

                //   ((TextView) findViewById(R.id.fire)).setMovementMethod(LinkMovementMethod.getInstance());
                // ((TextView) findViewById(R.id.fire)).setText(Html.fromHtml(getResources().getString(R.string.string_with_links)));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });
        //NOW YOU HAVE ARRAYLIST WHICH HOLD RESULTS

    }

    @Override
    protected void onResume () {
        super.onResume();
        registerInternetCheckReceiver();
    }

    @Override
    protected void onPause () {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
    }

    private void registerInternetCheckReceiver() {
        IntentFilter internetFilter = new IntentFilter();
        internetFilter.addAction("android.net.wifi.STATE_CHANGE");
        internetFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(broadcastReceiver, internetFilter);
    }
public BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
        String status = getConnectivityStatusString(context);
        setSnackbarMessage(status, false);
    }
};
    public static int getConnectivityStatus (Context context){
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;
        }
        return TYPE_NOT_CONNECTED;
    }


    public static String getConnectivityStatusString(Context context) {
        int conn = getConnectivityStatus(context);
        String status = null;
        if (conn == TYPE_WIFI) {
            status = "Wifi enabled";
        } else if (conn == TYPE_MOBILE) {
            status = "Mobile data enabled";
        } else if (conn == TYPE_NOT_CONNECTED) {
            status = "Not connected to Internet";
        }
        return status;
    }

    private void setSnackbarMessage(String status, boolean showBar) {
        String internetStatus = "";
        if (status.equalsIgnoreCase("Wifi enabled") || status.equalsIgnoreCase("Mobile data enabled")) {
            internetStatus = "Connected to Internet";
        } else {
            internetStatus = "Not Connected to Internet";
        }
        if (internetStatus.equals("Not Connected to Internet")) {
            hg = Snackbar.LENGTH_INDEFINITE;
        }
        else{

            hg = Snackbar.LENGTH_LONG;
        }


        snackbar = Snackbar.make(coordinatorLayout, internetStatus, hg);

        // Changing message text color
        snackbar.setActionTextColor(Color.WHITE);
        // Changing action button text color
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.WHITE);
        if (internetStatus.equalsIgnoreCase("Not Connected to Internet")) {
            if (internetConnected) {
                snackbar.show();
                internetConnected = false;
            }
        } else {
            if (!internetConnected) {
                internetConnected = true;
                snackbar.show();
            }
        }
    }

}



