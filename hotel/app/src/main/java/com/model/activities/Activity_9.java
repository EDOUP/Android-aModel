package com.model.activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Activity_9 extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_9);
		
		/*接收从Fragment_1传来的数据数据*/
        Bundle bundle = this.getIntent().getExtras();
     //   String id = bundle.getString("ID");
      //  TextView tv_activity_9=(TextView)findViewById(R.id.tv_activity_9);

        TextView  activity9_text=(TextView)findViewById(R.id.activity_9_text);
        activity9_text.setMovementMethod(ScrollingMovementMethod.getInstance());

     //   TextView activity9_title=(TextView) findViewById(R.id.activity_9_title);

        String[] titles={"宾客须知","今日新闻","景点交通","酒店设施","餐饮服务",
                "前台服务","客房服务","失物招领"
        };//模拟几组标题

      //  tv_activity_9.setText(id);

	}

}
