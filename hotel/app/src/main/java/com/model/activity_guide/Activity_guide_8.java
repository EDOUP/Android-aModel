package com.model.activity_guide;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.model.activities.R;
import com.model.adapters.NewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26 0026.
 */

public class Activity_guide_8 extends Activity{
    private View first,second;
    private ViewPager viewPager;//对应 <android.support.v4.view.ViewPager/>控件
    private List<View> viewList;//View数组
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide8);
 /*初始化*/
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        LayoutInflater inflater = getLayoutInflater();
        first = inflater.inflate(R.layout.activity_guide8_page1,null);
        second = inflater.inflate(R.layout.activity_guide8_page2,null);
       // TextView text1= (TextView) findViewById(R.id.guide8_textview1);
        //TextView text2= (TextView) findViewById(R.id.guide8_textview2);

        viewList = new ArrayList<View>();// 将要分页显示的View装入数组中
        viewList.add(first);
        viewList.add(second);

        /*适配器部分*/
        NewPagerAdapter pagerAdapter = new NewPagerAdapter(viewList);
        viewPager.setAdapter(pagerAdapter);
    }


}
