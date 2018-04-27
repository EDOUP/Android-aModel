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

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/31 0031.
 */

public class ActivityGuide3_ListViewAdapter extends BaseAdapter {
    private  LayoutInflater layoutInflater;
    private  List<Map<String,Object>> dataList;
    private DownloadImage downloadImage;

    public ActivityGuide3_ListViewAdapter(Context context) {
        super();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return this.dataList.size();
    }
    public void setData(List<Map<String,Object>> dataList){
        this.dataList=dataList;
    }
    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        // TODO 自动生成的方法存根
        View view;
        if(convertview==null)
            view=layoutInflater.inflate(R.layout.activity_guide3_item,null);
        else
            view=convertview;
        /*获取ListView的Item上各View的对象*/
        TextView guide3_textView1=(TextView)view.findViewById(R.id.guide3_item_textView1);
        TextView guide3_textView2=(TextView)view.findViewById(R.id.guide3_item_textView2);
        TextView guide3_textView3=(TextView)view.findViewById(R.id.guide3_item_textView3);
        TextView guide3_textView4=(TextView)view.findViewById(R.id.guide3_item_textView4);
        TextView guide3_textView5=(TextView)view.findViewById(R.id.guide3_item_textView5);
        final ImageView imageView1=(ImageView)view.findViewById(R.id.guide3_item_imageView2);
		/*绑定数据*/
		guide3_textView1.setText((CharSequence) dataList.get(position).get("Text1"));
        guide3_textView2.setText((CharSequence) dataList.get(position).get("Text2"));
        guide3_textView3.setText((CharSequence) dataList.get(position).get("Text3"));
        guide3_textView4.setText((CharSequence) dataList.get(position).get("Text4"));
        guide3_textView5.setText((CharSequence) dataList.get(position).get("Text5"));


      //  guide6_name.setText((CharSequence) dataList.get(position).get("Name"));
       // guide6_telephone.setText((CharSequence) dataList.get(position).get("Tele_number"));
       // guide6_introduce.setText((CharSequence) dataList.get(position).get("Introduce"));
      //  itemId.setText(dataList.get(position).get("G03_item_id")+"");
        /*异步加载图片,绑定到相应位置*/
        String imgAddress=(String) dataList.get(position).get("ImgAddress");
        downloadImage = new DownloadImage(imgAddress );
        downloadImage.loadImage(new DownloadImage.ImgCallBack(){
            public void getDrawable(Drawable drawable) {
                imageView1.setImageDrawable(drawable);
            }
        });
        return view;

    }
}
