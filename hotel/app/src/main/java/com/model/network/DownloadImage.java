package com.model.network;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	private String imgPath;
	
	public DownloadImage(String imgPath){
		this.imgPath=imgPath;
	}




    public void loadImage(final ImgCallBack imgCallBack){
		final Handler handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				imgCallBack.getDrawable((Drawable) msg.obj);
			}
		};
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Drawable drawable = Drawable.createFromStream(new URL(
							imgPath).openStream(), "");
					Message message = Message.obtain();
					message.obj = drawable;
					handler.sendMessage(message);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
	}
	
	
	// 定义接口
	public interface ImgCallBack {
		public void getDrawable(Drawable drawable);
	}

}


