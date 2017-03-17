package com.kingkarn.loginlayoutapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoveActivity extends AppCompatActivity {

    private LinearLayout btnLove;
    private TextView txtAws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        btnLove = (LinearLayout) findViewById(R.id.btnLove);
        txtAws = (TextView) findViewById(R.id.txtAws);

        btnLove.setOnClickListener(onClickLoveListener);
    }
    private View.OnClickListener onClickLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtAws.setText("xxxxx");
        }
    };
}
