package com.model.adapters;

import java.util.List;
import java.util.Map;

import com.model.activities.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LeftListViewAdapter extends BaseAdapter{
	private LayoutInflater layoutInflater;
	private List<Map<String,Object>> list;
	private int pointLocation;
	private boolean firstGetView=true;//侧拉菜单是否第一次加载，第一次加载左侧列表默认没有黄色圆点
	public LeftListViewAdapter(Context context) {
		super();
		layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	

	/*设置侧拉菜单列表的图标和文字*/
	public void setData(List<Map<String,Object>> list){
		this.list=list;
		
	}
	
	/*侧拉菜单小圆点的位置,即选中标记的设置*/
	public void setData(int pointLocation){
		this.pointLocation=pointLocation;
	}


	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		return list.size();
	}





	@Override
	public Object getItem(int position) {
		// TODO 自动生成的方法存根
		return list.get(position);
	}





	@Override
	public long getItemId(int position) {
		// TODO 自动生成的方法存根
		return position;
	}
	
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO 自动生成的方法存根
		View view;
		if(convertView==null){
			view = layoutInflater.inflate(R.layout.left_item, null);
		}
		else
			view=convertView;
		TextView left_item_id = (TextView) view.findViewById(R.id.left_item_id);
		TextView left_item_title = (TextView) view.findViewById(R.id.left_item_text);
		ImageView left_item_ico=(ImageView)view.findViewById(R.id.left_item_img);
		ImageView left_item_point=(ImageView)view.findViewById(R.id.left_item_point);
		
		left_item_ico.setImageResource((Integer) list.get(position).get("pictureID"));
		left_item_title.setText((CharSequence) list.get(position).get("text"));
		left_item_id.setText((CharSequence) list.get(position).get("itemID"));
		left_item_point.setVisibility(view.INVISIBLE);
		if((!firstGetView)&&position==pointLocation){
			left_item_point.setVisibility(view.VISIBLE);
		}
		firstGetView=false;
		return view;
		
	}

}
