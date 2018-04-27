package com.model.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.model.activities.R;

public class Fragment_Left_06 extends Fragment implements View.OnClickListener{
	private ImageButton btn_openDrawer;
	private DrawerLayout drawerLayout;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_left_06, container, false);

			/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout = (DrawerLayout) this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer = (ImageButton) view.findViewById(R.id.f06_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch(view.getId()){
			case R.id.f06_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);
				Log.i("OOOOOOOOOOOOOOOO","OOOOOOOOOOOOOOOOO");

		}

	}
}
