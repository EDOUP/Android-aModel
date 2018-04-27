package com.model.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.model.activities.R;
import com.model.network.DownloadImage;
import com.model.network.DownloadImage.ImgCallBack;

import java.util.List;
import java.util.Map;

public class Fragment_11_ListViewAdapter extends BaseAdapter{
	
	private LayoutInflater layoutInflater;
	private List<Map<String,Object>> dataList;
	private DownloadImage downloadImage;
	
	public Fragment_11_ListViewAdapter(Context context) {
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
			view=layoutInflater.inflate(R.layout.fragment_left_11_item, null);
		else
			view=convertview;
		
		/*获取ListView的Item上各View的对象*/
		TextView title=(TextView)view.findViewById(R.id.f11_item_title);
		TextView summary=(TextView)view.findViewById(R.id.f11_item_summary);
		final ImageView mainPicture=(ImageView)view.findViewById(R.id.f11_item_img);
		ImageView hadRead=(ImageView)view.findViewById(R.id.f11_item_hadRead);
		TextView itemId=(TextView)view.findViewById(R.id.f11_item_id);


		/*绑定数据*/
		title.setText((CharSequence) dataList.get(position).get("Title"));
		summary.setText((CharSequence) dataList.get(position).get("Summary"));
		itemId.setText(dataList.get(position).get("f11_item_id")+"");

		/*根据传来的数据判断是否已经读过，从而选择是否设置小黄点*/
		if((Boolean) dataList.get(position).get("HadRead"))
			hadRead.setVisibility(view.INVISIBLE);
		else
			hadRead.setVisibility(view.VISIBLE);
		
		/*异步加载图片,绑定到相应位置*/
		String imgAddress=(String) dataList.get(position).get("ImgAddress");
	//	downloadImage = new DownloadImage(CommonURL.fragment_11_item_ImgPath + imgAddress );
		downloadImage = new DownloadImage(""+ imgAddress );

		downloadImage.loadImage(new ImgCallBack() {
			public void getDrawable(Drawable drawable) {
				mainPicture.setImageDrawable(drawable);
			}
		});
		
		return view;
				
	}

}
