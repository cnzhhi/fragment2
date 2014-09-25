package com.example.fragment2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // FrameLayout body = (FrameLayout) findViewById(R.id.body);
        // body.removeAllViews();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.body, new MainFragment()).commit();
    }

}
