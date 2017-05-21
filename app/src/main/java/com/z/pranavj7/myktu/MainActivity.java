package com.z.pranavj7.myktu;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created by pinkzz on 5/1/2017.
 */
public class MainActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawer;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    ActionBarDrawerToggle mDrawerToggle;
    String KTU = "<a href=\"https://ktu.edu.in/eu/core/announcements.htm\">Go to site</a>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        View header = navigationView.getHeaderView(0);
        //ProgressBar mp = (ProgressBar) header.findViewById(R.id.drawerHeaderProgress);
        //mp.setVisibility(View.GONE);
            TextView text = (TextView) header.findViewById(R.id.site);
            text.setMovementMethod(LinkMovementMethod.getInstance());

        text.setText(Html.fromHtml(KTU));
        text.setTextColor(getResources().getColor(R.color.white));
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(mToolbar);
        new Title().execute();
        getSupportFragmentManager()

                .beginTransaction()

                .replace(R.id.fragment_container, new SelectYearFragment())


                .commit();

        ButterKnife.bind(this);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar,
                R.string.open, R.string.close);

        mDrawer.addDrawerListener(mDrawerToggle);


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectDrawerItem(item);
                return true;
            }
        });

        mNavigationView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i, int i1, int i2, int i3, int i4, int i5,
                                       int i6, int i7) {

                mNavigationView.removeOnLayoutChangeListener(this);

            }
        });
    }


    public void refresh(View view)
    {
        new Title().execute();
    }
    public void share(View view)
    {

        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_TEXT, ""+""+""+""+ "My KTU - Announcements" + "\n\n" + title0);
        startActivity(Intent.createChooser(share, "Share link!"));
    }
    String title0=" ";

    private class Title extends AsyncTask<Void, Void, Void> {
        /**@Override
        protected void onPreExecute() {
            NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
            View header = navigationView.getHeaderView(0);
            ProgressBar mp = (ProgressBar) header.findViewById(R.id.drawerHeaderProgress);
            super.onPreExecute();
            mp.setVisibility(View.VISIBLE);
        }
         **/
        @Override
        protected Void doInBackground(Void... params) {
            try {
                title0="";
                // Connect to the web site
                String url = "http://www.ktu.edu.in";
                Document document = Jsoup.connect(url).get();
                // Connect to the web site
                // Get the html document title
                // Using Elements to get the Meta data
                // Elements div = document.select("div.news-title");
                // select your div with yor class
                //   Elements ul = document.select("ul.annuncement");
                // Elements li = ul.select("li");
                Elements ul = document.select("ul.annuncement > li");
                // title = ul.text();
                if(ul!=null) {
                    for (int i = 0; i < ul.size()-2; i++) {
                        title0 = title0 + "\n\n" +  "•\t\t" +  ul.get(i).text();

                    }
                }
                //   Log.d("jsoup", "size: " + li.size());
            } catch (IOException e) {
                Log.e("jsoup", " error bro ");
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Set description into TextView
            NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
          View header = navigationView.getHeaderView(0);
            //ProgressBar mp = (ProgressBar) header.findViewById(R.id.drawerHeaderProgress);
            //mp.setVisibility(View.GONE);
            if(!(title0.equals(""))) {
                TextView text = (TextView) header.findViewById(R.id.quote_of_the_day);
                text.setMovementMethod(LinkMovementMethod.getInstance());
                text.setText(title0);
            }
            else{
                TextView text = (TextView) header.findViewById(R.id.quote_of_the_day);
                text.setMovementMethod(LinkMovementMethod.getInstance());
                text.setText("Please try refreshing");
            }
        }
    }


    public void selectDrawerItem(MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()) {
            case R.id.home:
                fragment = new SelectYearFragment();
                break;
            case R.id.support:
                fragment = new SupportFragment();
                break;
            case R.id.about:
                fragment = new DeveloperFragment();
                break;
            case R.id.share:
                fragment = new ShareFragment();
                break;
            default:
                fragment = new SelectYearFragment();
        }


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();

        item.setChecked(true);

        setTitle(item.getTitle());

        mDrawer.closeDrawers();
    }

    @Override
    public void onBackPressed() {
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

}
