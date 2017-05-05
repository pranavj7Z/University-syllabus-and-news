package com.example.pranavj7.ktuhelper;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import android.os.AsyncTask;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created by pinkzz on 5/1/2017.
 */
public class Main extends AppCompatActivity {
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawer;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        new Title().execute();
        getSupportFragmentManager()

                .beginTransaction()

                .replace(R.id.fragment_container, new FirstActivity())

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

    private class Title extends AsyncTask<Void, Void, Void> {
        String desc;
        ProgressDialog mProgressDialog;

        String title0;
        String title1;
        String title2;
        String title3;
        String title4;

        @Override
        protected Void doInBackground(Void... params) {
            try {
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
                //               title = ul.text();
                if (ul != null) {

                    title0 = ul.get(0).text();
                    title1 = ul.get(1).text();
                    title2 = ul.get(2).text();
                    title3 = ul.get(3).text();
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
            if(title0==null)
            {
                title0="Please check your internet connection or try again later";
                title1="";
                title2="";
                title3="";
                title4="";
            }
            TextView txtdesc = (TextView) findViewById(R.id.quote_of_the_day);
            txtdesc.setText(title0 + "\n\n" + title1 + "\n\n" + title2 + "\n\n" + title3 + "\n\n");
        }

    }

    public void selectDrawerItem(MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()) {
            case R.id.home:
                fragment = new FirstActivity();
                break;
            case R.id.support:
                fragment = new support();
                break;
            case R.id.about:
                fragment = new FirstActivity();
                break;
            case R.id.share:
                fragment = new share();
                break;
            default:
                fragment = new FirstActivity();
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



