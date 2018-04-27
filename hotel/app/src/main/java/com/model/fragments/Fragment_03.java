package com.model.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.model.activities.R;
import com.model.adapters.fragment_3_ListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Fragment_03 extends Fragment implements ListView.OnItemClickListener {

	private ListView f3_list;//主页的列表
	private fragment_3_ListViewAdapter f3ListViewAdapter;
	private List<Map<String,Object>> dataList;//要设置在home_item上的数据

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_3,container,false);
		/*为该页面的ListView绑定数据*/
		f3_list=(ListView)view.findViewById(R.id.f3_listview);
		f3ListViewAdapter=new fragment_3_ListViewAdapter(this.getActivity());
		dataList= ContentConstructor.dataSourceOfF3();//数据来源与ContentConstructor
		f3ListViewAdapter.setData(dataList);
		f3_list.setAdapter(f3ListViewAdapter);
		f3ListViewAdapter.notifyDataSetChanged();

		/*为按钮设置监听器，打开侧拉菜单*/
	//	drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
	//	btn_openDrawer=(ImageButton)view.findViewById(R.id.f1_btn_openDrawer);
	//	btn_openDrawer.setOnClickListener(this);

		f3_list.setOnItemClickListener(this);

		return view;

	}


/*

	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch(view.getId()){
			case R.id.f1_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);//点击按钮呼出侧拉菜单

		}

	}

*/
	/*主页的ListView的item点击事件:跳转到一个新Activity，并携带数据*/
	public void onItemClick(AdapterView<?> adp, View v, int position, long id) {
		TextView f3_ItemText=(TextView)v.findViewById(R.id.f3_item_text);//获取该条item的ID所在TextView对象





		FragmentManager fragmentManager=getFragmentManager();
        Fragment fragment=fragmentManager.findFragmentByTag("comment");
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


       fragmentTransaction.remove(fragment);

        fragmentTransaction.commit();

	}

}
