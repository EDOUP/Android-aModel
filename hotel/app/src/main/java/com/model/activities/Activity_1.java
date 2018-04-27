package com.model.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.model.network.CommonURL;
import com.model.network.DownloadImage;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Activity_1 extends Activity{

    private List<Map<String, Object>> datalist;
    private ImageView imageView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_1);

        //测试数据
        String string[]={"XX简介",
                "XX位于XX大街XXX号\n是一家综合性XXX\n再有几十个字就好了吧",
               "正文示例.........\n随便写点\n这个界面不好看...."
        };
		/*接收从Fragment_1传来的数据数据*/
        Bundle bundle = this.getIntent().getExtras();
        String id = bundle.getString("ID");


       //设置图片上面的Text（主题）
        TextView tv_title=(TextView)findViewById(R.id.tv1_title);
        tv_title.setText(string[0]);
        //图片右边的Text
        TextView tv_digest=(TextView)findViewById(R.id.tv1_digest);
        tv_digest.setText(string[1]);

        //图片下面的text
        TextView tv_activity_1=(TextView)findViewById(R.id.tv_activity_1);
        tv_activity_1.setText(id+"\n"+string[2]);

        //接收将Fragment_1的图片
       imageView=(ImageView)findViewById(R.id.tv1_newspic);
        datalist= ContentConstructor.dataSourceOfHome();
       String imgAddress=(String) datalist.get(Integer.parseInt(id)).get("ImgAddress");
       DownloadImage downloadImage = new DownloadImage(CommonURL.homeImgPath + imgAddress );

        downloadImage.loadImage(new DownloadImage.ImgCallBack() {
            @Override
            public void getDrawable(Drawable drawable) {
                imageView.setImageDrawable(drawable);
            }
        });

	}

}
