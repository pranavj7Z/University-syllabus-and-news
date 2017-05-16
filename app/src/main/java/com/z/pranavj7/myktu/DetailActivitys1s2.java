package com.z.pranavj7.myktu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by pinkzz on 5/4/2017.
 */
public class DetailActivitys1s2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Toolbar mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        TextView txtView = (TextView) findViewById(R.id.textView1);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        int getName = (int) bd.get("name");
        txtView.setText(getName);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ge_menu, menu);
        return true;
    }

    public boolean OnQuestionsClicked(MenuItem item) {
        if(item.getItemId()== R.id.qp){

            Intent slideactivity = new Intent(DetailActivitys1s2.this,DetailQuestionsactivitys1s2.class);
            startActivity(slideactivity);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
        return true;
    }
    public boolean OnNotesClicked(MenuItem item) {
        if(item.getItemId()== R.id.notes){

            Intent slideactivity = new Intent(DetailActivitys1s2.this,DetailNotesactivity.class);
            startActivity(slideactivity);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
        return true;
    }

}
