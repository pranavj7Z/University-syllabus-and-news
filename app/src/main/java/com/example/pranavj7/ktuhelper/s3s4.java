package com.example.pranavj7.ktuhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;

/**
 * Created by pranavj7 on 9/14/2016.
 */
public class s3s4 extends AppCompatActivity {
    static String net = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testcourse);
        Toolbar mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }    }

    public void cs(View view)
{
    net = "cs";
    Intent slideactivity = new Intent(s3s4.this,Network.class);
    startActivity(slideactivity);
    overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
}
    public void ce(View view)
    {
        net = "ce";
        Intent slideactivity = new Intent(s3s4.this,Network.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
    public void ee(View view)
    {
        net = "ee";
        Intent slideactivity = new Intent(s3s4.this,Network.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

    public void ec(View view)
    {
        net = "ec";
        Intent slideactivity = new Intent(s3s4.this,Network.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
    public void me(View view)
    {
        net = "me";
        Intent slideactivity = new Intent(s3s4.this,Network.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}
