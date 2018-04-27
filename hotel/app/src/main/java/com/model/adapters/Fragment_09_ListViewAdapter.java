package com.model.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.model.activities.R;

import java.util.List;
import java.util.Map;



public class Fragment_09_ListViewAdapter extends BaseAdapter{
	
	private LayoutInflater layoutInflater;
	private List<Map<String,Object>> dataList;
	
	public Fragment_09_ListViewAdapter(Context context) {
		super();
		layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public void setData(List<Map<String,Object>> dataList){
		this.dataList=dataList;
	}

	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		return dataList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO 自动生成的方法存根
		return dataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO 自动生成的方法存根
		return position;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup viewGroup) {
		// TODO 自动生成的方法存根
		View view;
		if(convertview==null)
			view=layoutInflater.inflate(R.layout.fragment_left_09_item, null);
		else
			view=convertview;
		
		/*获取ListView的Item上各View的对象*/
		TextView title=(TextView)view.findViewById(R.id.f09_item_title);
		TextView itemId=(TextView)view.findViewById(R.id.f09_item_id);

		/*绑定数据*/
		title.setText((CharSequence) dataList.get(position).get("Title"));
		itemId.setText(dataList.get(position).get("f09_item_id")+"");

		return view;
				
	}

}
