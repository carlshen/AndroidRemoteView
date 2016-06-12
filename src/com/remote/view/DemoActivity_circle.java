package com.remote.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class DemoActivity_circle extends Activity {
    private static final String TAG = "DemoActivity_circle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_circle);
        initView();
    }

    private void initView() {
        Toast.makeText(this, getIntent().getStringExtra("sid"),
                Toast.LENGTH_SHORT).show();
    }
}
