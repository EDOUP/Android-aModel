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

import com.model.activities.Activity_1;
import com.model.activities.R;
import com.model.adapters.HomeListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;
  
public class Fragment_1 extends Fragment implements OnClickListener,ListView.OnItemClickListener{

	private ListView home_list;//主页的列表
	private HomeListViewAdapter homeListViewAdapter;
	private List<Map<String,Object>> dataList;//要设置在home_item上的数据
	private ImageButton btn_openDrawer;
	private DrawerLayout drawerLayout;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_1, null);
		
		/*为该页面的ListView绑定数据*/
		home_list=(ListView)view.findViewById(R.id.fragment_1_listView);
		homeListViewAdapter=new HomeListViewAdapter(this.getActivity());
		dataList=ContentConstructor.dataSourceOfHome();//数据来源与ContentConstructor
		homeListViewAdapter.setData(dataList);
		home_list.setAdapter(homeListViewAdapter);
		homeListViewAdapter.notifyDataSetChanged();
		
		/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer=(ImageButton)view.findViewById(R.id.f1_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);
		
		home_list.setOnItemClickListener(this);

		return view;
		
	}

	
	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch(view.getId()){
		case R.id.f1_btn_openDrawer:
			drawerLayout.openDrawer(Gravity.START);//点击按钮呼出侧拉菜单
			
		}
		
	}
	
	
	/*主页的ListView的item点击事件:跳转到一个新Activity，并携带数据*/
	public void onItemClick(AdapterView<?> adp, View v, int position, long id) {
		TextView homeItemId=(TextView)v.findViewById(R.id.home_item_id);//获取该条item的ID所在TextView对象
		Log.i("AAAAAAAAAAAA",homeItemId.getText().toString());
		Intent intent=new Intent(this.getActivity(),Activity_1.class);//新建一个意图，从MainActivity跳转到Activity_1
	    Bundle bundle=new Bundle();//用Bundle携带数据
	    bundle.putString("ID", homeItemId.getText().toString());//传递参数为该条item的ID
	    intent.putExtras(bundle);
		startActivity(intent);
	}

}
