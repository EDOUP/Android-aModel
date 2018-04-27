package com.model.activities;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.model.adapters.LeftListViewAdapter;
import com.model.adapters.ViewPagerAdapter;
import com.model.fragment_manager.LeftFragmentManager;
import com.model.fragments.Fragment_1;
import com.model.fragments.Fragment_2;
import com.model.listeners.MyDrawerListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends FragmentActivity implements OnClickListener,ListView.OnItemClickListener{
	private ViewPager viewPager;//声明控件ViewPager
	private FragmentPagerAdapter fragmentPagerAdapter;//声明碎片页面适配器
	private LinearLayout bottom_fragment_1;//底部按钮1
	private LinearLayout bottom_fragment_2;//底部按钮2
	private TextView tv_bottom_selected_1;//选中状态条
	private TextView tv_bottom_selected_2;//选中状态条
	private Fragment_1 fragment_1;//碎片1
	private Fragment_2 fragment_2;//碎片2
	private List<Fragment> fragments; //存放四个核心fragment的列表
	private ListView left_list;//左侧拉菜单列表
	private LeftListViewAdapter leftListViewAdapter;//左侧拉菜单列表适配器
	private FrameLayout frameLayout;//放fragment的部分，是ViewPager的祖父布局
	private LeftFragmentManager lfm;//管理侧拉菜单响应事件对应的fragment
	private RelativeLayout mainUI;//四个核心Fragment的父布局，在“返回主界面”方法中作用
	private boolean backOrExit=true;//返回或退出
	private DrawerLayout drawerLayout;//侧拉菜单控件对象


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		frameLayout=(FrameLayout)findViewById(R.id.fragment_left_content);
		fragments = new ArrayList<Fragment>();
		initView();

		/*ViewPager适配器设置*/
		viewPager=(ViewPager)findViewById(R.id.id_viewpager);
		fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
		viewPager.setAdapter(fragmentPagerAdapter);
		viewPagerScrollListener();//调用该方法，监听ViewPager的滑动事件

		/*为底部四个按钮设置点击事件监听器*/
		bottom_fragment_1.setOnClickListener(this);
		bottom_fragment_2.setOnClickListener(this);


		/*侧拉菜单的标题及图标的数据源及其适配器的绑定*/
		String[] titles={"Browser","Maps","Wi-Fi Hostspot","Brand Promotions","My Phone Number","Change Language",
				"Settings","FAQs","City Guide","My account","handy Messages"
		};
		int[] drawables_id={R.drawable.browser,R.drawable.maps,R.drawable.wifi,R.drawable.brand,R.drawable.phone_number,
				R.drawable.change_language,R.drawable.setting,R.drawable.faqs,R.drawable.city_guide,R.drawable.account,
				R.drawable.message};
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("pictureID", drawables_id[i]);
			map.put("text", titles[i]);
			map.put("itemID", i+"");
			list.add(map);
		}

		left_list=(ListView)findViewById(R.id.left_listView);
		leftListViewAdapter=new LeftListViewAdapter(this);
		leftListViewAdapter.setData(list);
		left_list.setAdapter(leftListViewAdapter);
		leftListViewAdapter.notifyDataSetChanged();
		left_list.setOnItemClickListener(this);

		/*绑定drawerLayout的监听器*/
		drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
		drawerLayout.setDrawerListener(new MyDrawerListener(frameLayout));

	}





	/*初始化视图*/
	private void initView(){
		bottom_fragment_1=(LinearLayout)findViewById(R.id.bottom_fragment_1);
		bottom_fragment_2=(LinearLayout)findViewById(R.id.bottom_fragment_2);
		tv_bottom_selected_1=(TextView)findViewById(R.id.bottome_selected_1);
		tv_bottom_selected_2=(TextView)findViewById(R.id.bottome_selected_4);
		fragment_1=new Fragment_1();
		fragment_2=new Fragment_2();
		fragments.add(fragment_1);
		fragments.add(fragment_2);

	}

	/*将底部按钮的背景重置为灰色*/
	protected void resetBackground(){
		bottom_fragment_1.setBackgroundColor(Color.parseColor("#C2C2C2"));
		bottom_fragment_2.setBackgroundColor(Color.parseColor("#C2C2C2"));
		tv_bottom_selected_1.setBackgroundColor(Color.parseColor("#C2C2C2"));
		tv_bottom_selected_2.setBackgroundColor(Color.parseColor("#C2C2C2"));
	}


	/*底部按钮点击事件的监听*/
	@Override
	public void onClick(View v) {
		// TODO 自动生成的方法存根
		switch(v.getId()){
			case R.id.bottom_fragment_1:
				bottom_fragment_1.setBackgroundColor(Color.parseColor("#ffffff"));
				tv_bottom_selected_1.setBackgroundColor(Color.parseColor("#000000"));
				viewPager.setCurrentItem(0);
				break;
			case R.id.bottom_fragment_2:
				bottom_fragment_2.setBackgroundColor(Color.parseColor("#ffffff"));
				tv_bottom_selected_2.setBackgroundColor(Color.parseColor("#000000"));
				viewPager.setCurrentItem(3);
				break;

		}


	}


	/*ViewPager(四个主页面)的滑动事件监听*/
	private void viewPagerScrollListener(){
		viewPager.setOnPageChangeListener(new OnPageChangeListener(){
			@Override
			public void onPageScrollStateChanged(int position) {

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void onPageSelected(int position) {
				// TODO 自动生成的方法存根
				resetBackground();
				switch(position){
					case 0:
						bottom_fragment_1.setBackgroundColor(Color.parseColor("#ffffff"));
						tv_bottom_selected_1.setBackgroundColor(Color.parseColor("#000000"));
						break;
					case 1:
						bottom_fragment_2.setBackgroundColor(Color.parseColor("#ffffff"));
						tv_bottom_selected_2.setBackgroundColor(Color.parseColor("#000000"));
						break;
				}
			}

		});
	}





	/*监听点击侧拉菜单Item事件*/
	@Override
	public void onItemClick(AdapterView<?> adp, View v, int position, long id) {
		backOrExit=true;
		TextView tv_leftItemId=(TextView)v.findViewById(R.id.left_item_id);
		int leftItemId=Integer.valueOf((String) tv_leftItemId.getText());
		lfm=new LeftFragmentManager(getSupportFragmentManager());//管理页面的类的对象
		switch(leftItemId){
			case 0:
				this.startActivityForResult(new Intent().setClass(com.model.activities.MainActivity.this,Activity_Web.class),0);
				leftListViewAdapter.setData(0);
				break;
			case 1:
				this.startActivityForResult(new Intent().setClass(com.model.activities.MainActivity.this,Activity_Map.class),1);
				leftListViewAdapter.setData(1);
				break;
			case 2:
				lfm.setFragmentSelection(2);
				leftListViewAdapter.setData(2);
				break;
			case 3:
				lfm.setFragmentSelection(3);
				leftListViewAdapter.setData(3);
				break;
			case 4:
				lfm.setFragmentSelection(4);
				leftListViewAdapter.setData(4);
				break;
			case 5:
				lfm.setFragmentSelection(5);
				leftListViewAdapter.setData(5);
				break;
			case 6:
				lfm.setFragmentSelection(6);
				leftListViewAdapter.setData(6);
				break;
			case 7:
				lfm.setFragmentSelection(7);
				leftListViewAdapter.setData(7);
				break;
			case 8:
				lfm.setFragmentSelection(8);
				leftListViewAdapter.setData(8);
				break;
			case 9:
				this.startActivityForResult(new Intent().setClass(com.model.activities.MainActivity.this,Activity_user.class),9);
				leftListViewAdapter.setData(9);
				//lfm.setFragmentSelection(9);

				break;
			case 10:
				lfm.setFragmentSelection(10);
				leftListViewAdapter.setData(10);
				break;
		}
		leftListViewAdapter.notifyDataSetChanged();


	}




	/*重写系统返回键的监听事件*/
	public void onBackPressed(){
		/*如果为true则返回主界面,否则退出(检测侧栏是否开启)*/
		if(backOrExit){
			if(drawerLayout.isDrawerOpen(Gravity.START)) {
				drawerLayout.closeDrawer(Gravity.START);//点击关闭侧拉菜单
				leftListViewAdapter.notifyDataSetChanged();
				backOrExit=true;
			}
			else {
				Toast.makeText(MainActivity.this, "再按一次退出", Toast.LENGTH_SHORT).show();
				leftListViewAdapter.setData(100);//设置一个超出范围的值，清除标记
				leftListViewAdapter.notifyDataSetChanged();
				mainUI = (RelativeLayout) findViewById(R.id.mainUI);
				viewPager.setCurrentItem(0);
				frameLayout.bringChildToFront(mainUI);
				backOrExit = false;
			}
		}
		else{
			/*检测侧滑栏是否开启*/
			if(drawerLayout.isDrawerOpen(Gravity.START)) {
				drawerLayout.closeDrawer(Gravity.START);//点击关闭侧拉菜单
				leftListViewAdapter.notifyDataSetChanged();
				backOrExit=true;
			}
			else super.onBackPressed();
		}
	}




	/*接收从Fragment_1传来的数据数据*/
//	Bundle bundle = this.getIntent().getExtras();
	//String f3_phonenumber = bundle.getString("ID");
}
