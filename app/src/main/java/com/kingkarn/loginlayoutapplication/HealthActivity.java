package com.kingkarn.loginlayoutapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class HealthActivity extends AppCompatActivity {

    private LinearLayout btnHealth;
    private TextView txtAws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        btnHealth = (LinearLayout) findViewById(R.id.btnHealth);
        txtAws = (TextView) findViewById(R.id.txtAws);

        btnHealth.setOnClickListener(onClickHealthListener);
    }

    private View.OnClickListener onClickHealthListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtAws.setText("xxxxx");

        }
    };
}
