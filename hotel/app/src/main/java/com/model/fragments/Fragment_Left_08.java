package com.model.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.model.activities.R;

public class Fragment_Left_08 extends Fragment implements View.OnClickListener{
	private ImageButton btn_openDrawer;
	private DrawerLayout drawerLayout;
	private View view;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		view=inflater.inflate(R.layout.fragment_left_08, container, false);

		drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer=(ImageButton)view.findViewById(R.id.f08_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()){
			case R.id.f08_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);

		}

	}
}
