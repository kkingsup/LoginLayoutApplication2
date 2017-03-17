package com.kingkarn.loginlayoutapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;


public class MenuActivity extends AppCompatActivity {

    private LinearLayout imgBtnProfile;
    private LinearLayout imgBtnLove;
    private LinearLayout imgBtnHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgBtnProfile = (LinearLayout) findViewById(R.id.imgBtnProfile);
        imgBtnProfile.setOnClickListener(onClickProfileListener);
        imgBtnLove = (LinearLayout) findViewById(R.id.imgBtnLove);
        imgBtnLove.setOnClickListener(onClickLoveListener);
        imgBtnHealth = (LinearLayout) findViewById(R.id.imgBtnHealth);
        imgBtnHealth.setOnClickListener(onClickHealthListener);

    }//onCreate


    private View.OnClickListener onClickHealthListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inHealth = new Intent(getApplicationContext(), HealthActivity.class);
            startActivity(inHealth);
        }
    };
    private  View.OnClickListener onClickLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inLove = new Intent(getApplicationContext(), LoveActivity.class);
            startActivity(inLove);
        }
    };
    private View.OnClickListener onClickProfileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inProfile = new Intent(getApplicationContext(), DetailActivity.class);
            startActivity(inProfile);
        }//onClick
    };
}//MenuActivity
