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

import com.model.activities.R;
import com.model.activity_guide.Activity_guide_1;
import com.model.activity_guide.Activity_guide_2;
import com.model.activity_guide.Activity_guide_3;
import com.model.activity_guide.Activity_guide_4;
import com.model.activity_guide.Activity_guide_5;
import com.model.activity_guide.Activity_guide_6;
import com.model.activity_guide.Activity_guide_7;
import com.model.activity_guide.Activity_guide_8;
import com.model.adapters.Fragment_09_ListViewAdapter;
import com.model.test.ContentConstructor;

import java.util.List;
import java.util.Map;

public class Fragment_Left_09 extends Fragment implements OnClickListener,ListView.OnItemClickListener{
	
	private ListView f09_list;
	private Fragment_09_ListViewAdapter f09_ListViewAdapter;
	private List<Map<String, Object>> dataList;
	private ImageButton btn_openDrawer;
	private DrawerLayout drawerLayout;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_left_09, null);
		f09_list=(ListView)view.findViewById(R.id.frament_09_listView);
		f09_ListViewAdapter=new Fragment_09_ListViewAdapter(this.getActivity());
		dataList=ContentConstructor.dataSourceOfF09();
		f09_ListViewAdapter.setData(dataList);
		f09_list.setAdapter(f09_ListViewAdapter);
		f09_ListViewAdapter.notifyDataSetChanged();


		f09_list.setOnItemClickListener(this);


		/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer=(ImageButton)view.findViewById(R.id.f09_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);


		
		
		
		return view;
		
	}

	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch(view.getId()){
		case R.id.f09_btn_openDrawer:
			drawerLayout.openDrawer(Gravity.START);
			Log.i("OOOOOOOOOOOOOOOO","OOOOOOOOOOOOOOOOO");
			
		}
		
	}
	/*主页的ListView的item点击事件:跳转到Activity9，并携带数据*/
	public void onItemClick(AdapterView<?> adp, View v, int position, long id) {
		TextView f09_ItemId = (TextView) v.findViewById(R.id.f09_item_id);//获取该条item的ID所在TextView对象
		Log.i("AAAAAAAAAAAA", f09_ItemId.getText().toString());

		int ID=Integer.parseInt(f09_ItemId.getText().toString());

		switch(ID) {
			case 0:
				startActivity(new Intent(this.getActivity(), Activity_guide_1.class));
				break;
			case 1:
				startActivity(new Intent(this.getActivity(), Activity_guide_2.class));
				break;
			case 2:
				startActivity(new Intent(this.getActivity(), Activity_guide_3.class));
				break;
			case 3:
				startActivity(new Intent(this.getActivity(), Activity_guide_4.class));
				break;
			case 4:
				startActivity(new Intent(this.getActivity(), Activity_guide_5.class));
				break;
			case 5:
				startActivity(new Intent(this.getActivity(), Activity_guide_6.class));
				break;
			case 6:
				startActivity(new Intent(this.getActivity(), Activity_guide_7.class));
				break;
			case 7:
				startActivity(new Intent(this.getActivity(), Activity_guide_8.class));
				break;
		}
	}
}
