package com.model.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ImageButton;

public class Activity_user extends Activity implements View.OnClickListener {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_left_10);

        ImageButton btn_openDrawer=(ImageButton)findViewById(R.id.f10_btn_openDrawer);
        btn_openDrawer.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}
