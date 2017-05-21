package com.z.pranavj7.myktu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


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
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }    }

    public void cs(View view)
{
    net = "cs";
    Intent slideactivity = new Intent(s3s4.this,subjectsS3S4.class);
    startActivity(slideactivity);
}
    public void ce(View view)
    {
        net = "ce";
        Intent slideactivity = new Intent(s3s4.this,subjectsS3S4.class);
        startActivity(slideactivity);
    }
    public void ee(View view)
    {
        net = "ee";
        Intent slideactivity = new Intent(s3s4.this,subjectsS3S4.class);
        startActivity(slideactivity);
    }

    public void ec(View view)
    {
        net = "ec";
        Intent slideactivity = new Intent(s3s4.this,subjectsS3S4.class);
        startActivity(slideactivity);
    }
    public void me(View view)
    {
        net = "me";
        Intent slideactivity = new Intent(s3s4.this,subjectsS3S4.class);
        startActivity(slideactivity);
    }
}
