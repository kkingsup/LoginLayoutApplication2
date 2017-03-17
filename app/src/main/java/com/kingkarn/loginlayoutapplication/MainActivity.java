package com.kingkarn.loginlayoutapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnButton = (Button) findViewById(R.id.btnLogin); //ให้รู้จัดกันกับไฟล์ xml

        btnButton.setOnClickListener(onClickSubmitListener);

    }//onCreate

    private View.OnClickListener onClickSubmitListener = new View.OnClickListener() { //พิมถึง new แล้วกด ctrl+shift+space bar
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class); // รูปแบบในการขึ้นหน้าใหม่ Intent เหมือนซองจดหมาย จะใส่อะไรให้ใคร
            startActivity(intent);
        }//onClick()
    }; // View.OnClickListener
}//class MainActivity
