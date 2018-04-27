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

/**
 * Created by Administrator on 2017/12/31 0031.
 */

public class ActivityGuide6_ListViewAdapter extends BaseAdapter {
    private  LayoutInflater layoutInflater;
    private  List<Map<String,Object>> dataList;

    public ActivityGuide6_ListViewAdapter(Context context) {
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
            view=layoutInflater.inflate(R.layout.activity_guide6_item,null);
        else
            view=convertview;
        /*获取ListView的Item上各View的对象*/
        TextView guide6_name=(TextView)view.findViewById(R.id.guide6_name);
        TextView guide6_telephone=(TextView)view.findViewById(R.id.guide6_telephoneNumber);
        TextView guide6_introduce=(TextView)view.findViewById(R.id.guide6_introduce);
        TextView itemId=(TextView)view.findViewById(R.id.guide6_id);

		/*绑定数据*/
        guide6_name.setText((CharSequence) dataList.get(position).get("Name"));
        guide6_telephone.setText((CharSequence) dataList.get(position).get("Tele_number"));
        guide6_introduce.setText((CharSequence) dataList.get(position).get("Introduce"));
        itemId.setText(dataList.get(position).get("G06_item_id")+"");

        return view;

    }
}
