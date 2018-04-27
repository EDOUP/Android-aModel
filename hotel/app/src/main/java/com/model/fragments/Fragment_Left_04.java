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
import android.widget.ListView;

import com.model.activities.R;
import com.model.adapters.Fragment_04_ListViewAdapter;
import com.model.adapters.Fragment_11_ListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Fragment_Left_04 extends Fragment implements View.OnClickListener{
	private ListView f04_list;
	private Fragment_04_ListViewAdapter f04_ListViewAdapter;
	private List<Map<String, Object>> dataList;
	private DrawerLayout drawerLayout;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_left_04, container, false);
		f04_list=(ListView)view.findViewById(R.id.frament_04_listView);
		f04_ListViewAdapter=new Fragment_04_ListViewAdapter(this.getActivity());
		dataList= ContentConstructor.dataSourceOfF04();
		f04_ListViewAdapter.setData(dataList);
		f04_list.setAdapter(f04_ListViewAdapter);
		f04_ListViewAdapter.notifyDataSetChanged();

	/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout = (DrawerLayout) this.getActivity().findViewById(R.id.drawerLayout);
		ImageButton btn_openDrawer = (ImageButton) view.findViewById(R.id.f04_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);

		return view;
		
	}
	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch (view.getId()) {
			case R.id.f04_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);
				Log.i("OOOOOOOOOOOOOOOO", "OOOOOOOOOOOOOOOOO");

		}
	}
	
}
