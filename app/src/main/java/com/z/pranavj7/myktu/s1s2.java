package com.z.pranavj7.myktu;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class s1s2 extends AppCompatActivity {
    static String act = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1s2);
        Toolbar mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    public void graphy(View view) {
        act ="graphics";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.graphy);
        startActivity(intent);
    }
    public void physics(View view) {
      act ="physics";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.physics);
        startActivity(intent);
    }
    public void chem(View view) {
        act ="chemistry";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.chem);
        startActivity(intent);
    }
    public void mechanics(View view) {
        act="mechanics";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.mechanics);
        startActivity(intent);
    }
    public void bcivil(View view) {
        act="basicscivil";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.bcivil);
        startActivity(intent);
    }
    public void diff(View view) {
        act="differentialequation";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.diff);
        startActivity(intent);
    }
    public void mechanical(View view) {
        act="bme";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.bmech);
        startActivity(intent);
    }
    public void calculus(View view) {
        act="calculus";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.calculus);
        startActivity(intent);
    }
    public void design (View view) {
        act="designengg";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.des);
        startActivity(intent);
}
    public void IEC(View view) {
        act="iec";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.IECE);
        startActivity(intent);
    }
    public void IEE(View view) {
        act="iee";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.IEEE);
        startActivity(intent);
    }
    public void IME(View view) {
        act="ime";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.IME);
        startActivity(intent);
    }
    public void Icivil (View view) {
        act="icivil";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.ICIVIL);
        startActivity(intent);
    }
    public void BEC(View view) {
        act="bec";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.BEC);
        startActivity(intent);
    }
    public void BEE(View view) {
        act="bee";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.BEE);
        startActivity(intent);
    }
    public void ICPS (View view) {
        act="icps";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.ICPS);
        startActivity(intent);
    }

    public void ISE (View view) {
        act="ise";
        Intent intent = new Intent(s1s2.this, DetailActivitys1s2.class);
        intent.putExtra("name", R.string.ISE);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        startActivity(intent);
    }

}
