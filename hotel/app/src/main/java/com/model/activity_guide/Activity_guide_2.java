package com.model.activity_guide;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.model.activities.R;
import com.model.network.DownloadImage;


/**
 * Created by Administrator on 2017/12/26 0026.
 */

public class Activity_guide_2 extends Activity{
   private  ImageView guide2_newspic;
   private  TextView guide2_text;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide2);


        //模拟从网上下载一图片
        guide2_newspic =(ImageView)findViewById(R.id.guide2_newspic);
        DownloadImage downloadImage=new DownloadImage("http://file01.16sucai.com/d/file/2013/1018/51441c790e76c9c3f6478064d3cf2d26.jpg");

        //模拟正文
        guide2_text = (TextView) findViewById(R.id.guide2_text);
        guide2_text.setText("这里是新闻正文\n随意些一点\n可接入今日头条等新闻主页\nload.......");
        downloadImage.loadImage(new DownloadImage.ImgCallBack(){
            @Override
            public void getDrawable(Drawable drawable) {
                guide2_newspic.setImageDrawable(drawable);
            }
        });

    }

}
