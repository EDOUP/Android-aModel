package com.model.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.model.activities.Activity_11;
import com.model.activities.R;
import com.model.adapters.Fragment_11_ListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Fragment_Left_11 extends Fragment implements OnClickListener,ListView.OnItemClickListener{
	
	private ListView f11_list;
	private Fragment_11_ListViewAdapter f11_ListViewAdapter;
	private List<Map<String, Object>> dataList;
	private DrawerLayout drawerLayout;
	private ImageButton btn_openDrawer;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_left_11, null);
		f11_list=(ListView)view.findViewById(R.id.frament_11_listView);
		f11_ListViewAdapter=new Fragment_11_ListViewAdapter(this.getActivity());
		dataList=ContentConstructor.dataSourceOfF11();
		f11_ListViewAdapter.setData(dataList);
		f11_list.setAdapter(f11_ListViewAdapter);
		f11_ListViewAdapter.notifyDataSetChanged();
		
		
		/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer=(ImageButton)view.findViewById(R.id.f11_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);

		f11_list.setOnItemClickListener(this);
		
		
		
		return view;
		
	}

	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch(view.getId()){
		case R.id.f11_btn_openDrawer:
			drawerLayout.openDrawer(Gravity.START);

		}

	}


	/*主页的ListView的item点击事件:跳转到Activity11，并携带数据*/
	public void onItemClick(AdapterView<?> adp, View v, int position, long id) {
		TextView f11_ItemId=(TextView)v.findViewById(R.id.f11_item_id);//获取该条item的ID所在TextView对象
		Log.i("AAAAAAAAAAAA",f11_ItemId.getText().toString());
		Intent intent=new Intent(this.getActivity(),Activity_11.class);//新建一个意图，从MainActivity跳转到Activity_11
		Bundle bundle=new Bundle();//用Bundle携带数据
		bundle.putString("ID", f11_ItemId.getText().toString());//传递参数为该条item的ID
		intent.putExtras(bundle);
		startActivity(intent);
	}
}
