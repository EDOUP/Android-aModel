package com.model.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_11 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_11);
		
		/*接收从Fragment_11传来的数据数据*/
        Bundle bundle = this.getIntent().getExtras();
        String id = bundle.getString("ID");
        
        TextView tv_activity_11=(TextView)findViewById(R.id.tv_activity_11);
        tv_activity_11.setText(id);
	}

}
