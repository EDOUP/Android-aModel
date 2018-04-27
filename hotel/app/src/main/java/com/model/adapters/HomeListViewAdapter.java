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
import com.model.network.CommonURL;
import com.model.network.DownloadImage;
import com.model.network.DownloadImage.ImgCallBack;

import java.util.List;
import java.util.Map;

public class HomeListViewAdapter extends BaseAdapter{

	private LayoutInflater layoutInflater;
	private List<Map<String,Object>> dataList;
	private DownloadImage downloadImage;
	
	public HomeListViewAdapter(Context context) {
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
			view=layoutInflater.inflate(R.layout.home_item, null);
		else
			view=convertview;
		
		/*获取ListView的Item上各View的对象*/
		TextView title=(TextView)view.findViewById(R.id.home_item_title);
		TextView summary=(TextView)view.findViewById(R.id.home_item_summary);
		final ImageView mainPicture=(ImageView)view.findViewById(R.id.home_item_mainPicture);
		TextView releaseTime=(TextView)view.findViewById(R.id.home_item_time);
		ImageView liked=(ImageView)view.findViewById(R.id.home_item_liked);
		TextView likeNum=(TextView)view.findViewById(R.id.home_item_likeNum);
		TextView itemId=(TextView)view.findViewById(R.id.home_item_id);
		
		/*绑定数据*/
		title.setText((CharSequence) dataList.get(position).get("Title"));
		summary.setText((CharSequence) dataList.get(position).get("Summary"));
		releaseTime.setText((CharSequence) dataList.get(position).get("ReleaseTime"));
		likeNum.setText((Integer) dataList.get(position).get("LikeNum")+"");
		itemId.setText(dataList.get(position).get("Home_item_id")+"");
		
		/*根据传来的数据判断是否已经点赞，从而设置不同颜色的心形*/
		if((Boolean) dataList.get(position).get("Liked"))
			liked.setImageResource(R.drawable.like_red);
		else
			liked.setImageResource(R.drawable.like);
		
		/*异步加载图片,绑定到相应位置*/
		String imgAddress=(String) dataList.get(position).get("ImgAddress");
		downloadImage = new DownloadImage(CommonURL.homeImgPath + imgAddress );
		//downloadImage = new DownloadImage(""+ imgAddress );
		downloadImage.loadImage(new ImgCallBack() {
			public void getDrawable(Drawable drawable) {
				mainPicture.setImageDrawable(drawable);
			}
		});
		
		return view;
				
	}

}
