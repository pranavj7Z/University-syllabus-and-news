package com.example.pranavj7.ktuhelper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Created by pranavj7 on 9/11/2016.
 */
public class DetailQactivity extends s1s2 {
static String pj="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_questions);
    }
    public void q1(View view){pj="q1";repeat();}
    public void q2(View view){pj="q2";repeat();}
    public void q3(View view){pj="q3";repeat();}
    public void repeat()
    {
        Intent slideactivity = new Intent(DetailQactivity.this,qst_activity.class);
        startActivity(slideactivity);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}



