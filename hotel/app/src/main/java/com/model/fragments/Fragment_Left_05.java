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
import com.model.adapters.Fragment_05_ListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Fragment_Left_05 extends Fragment implements View.OnClickListener{
	private Fragment_05_ListViewAdapter f05_ListViewAdapter;
	private DrawerLayout drawerLayout;
	List<Map<String, Object>> dataList;
	ListView f05_list;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view= inflater.inflate(R.layout.fragment_left_05, container, false);
		f05_list = (ListView) view.findViewById(R.id.frament_05_listView);
		f05_ListViewAdapter=new Fragment_05_ListViewAdapter(this.getActivity());
		dataList = ContentConstructor.dataSourceOfF05();
		f05_ListViewAdapter.setData(dataList);
		f05_list.setAdapter(f05_ListViewAdapter);



		/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout = (DrawerLayout) this.getActivity().findViewById(R.id.drawerLayout);
		ImageButton btn_openDrawer = (ImageButton) view.findViewById(R.id.f05_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);

		return view;
	}
	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch (view.getId()) {
			case R.id.f05_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);
				Log.i("OOOOOOOOOOOOOOOO", "OOOOOOOOOOOOOOOOO");

		}
	}
}
