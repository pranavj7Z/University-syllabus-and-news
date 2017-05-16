package com.z.pranavj7.myktu;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pinkzz on 5/16/2017.
 */
public class DetailQuestionActivitys3s4 extends subjectsS3S4 {
    static String pj = "";
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mSemRef = mRootRef.child("s1s2");
    DatabaseReference mMaterialRef = mSemRef.child("questions");
    DatabaseReference mQuestionsRef = mMaterialRef.child("hhb");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_questions);
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
}


