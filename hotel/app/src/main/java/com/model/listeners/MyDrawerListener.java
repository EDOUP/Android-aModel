package com.model.listeners;

import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.View;
import android.widget.FrameLayout;

public class MyDrawerListener implements DrawerListener{
	private FrameLayout frameLayout;
	
	public MyDrawerListener(FrameLayout frameLayout){
		this.frameLayout=frameLayout;
	}

	@Override
	public void onDrawerClosed(View view) {
	}

	@Override
	public void onDrawerOpened(View view) {
		
	}

	@Override
	public void onDrawerSlide(View view, float arg1) {
		frameLayout.setTranslationX(view.getWidth()*arg1);//设置主页面随着侧拉菜单的变化而变化
	}

	@Override
	public void onDrawerStateChanged(int arg0) {
		
	}

}
