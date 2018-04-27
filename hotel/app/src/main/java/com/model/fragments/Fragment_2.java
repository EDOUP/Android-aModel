package com.model.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.text.InputType;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.model.activities.R;

public class Fragment_2 extends Fragment implements OnClickListener{

	private DrawerLayout drawerLayout;//侧拉菜单
	private ImageButton btn_openDrawer;//打开侧拉菜单的按钮
	private EditText editText;//输入号码的输入框
	private Button keyboard_1;
	private Button keyboard_2;
	private Button keyboard_3;
	private Button keyboard_4;
	private Button keyboard_5;
	private Button keyboard_6;
	private Button keyboard_7;
	private Button keyboard_8;
	private Button keyboard_9;
	private Button keyboard_xing;
	private Button keyboard_0;
	private Button keyboard_jin;
	private ImageButton keyboard_back;
	private ImageButton keyboard_call;
	private ImageButton keyboard_send;
	private FragmentTransaction transaction;
	private Fragment_03 fragment_03;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.fragment_2, container, false);
		
		/*为按钮设置监听器，打开侧拉菜单*/
		drawerLayout=(DrawerLayout)this.getActivity().findViewById(R.id.drawerLayout);
		btn_openDrawer=(ImageButton)view.findViewById(R.id.f2_btn_openDrawer);
		btn_openDrawer.setOnClickListener(this);
		
		editText=(EditText)view.findViewById(R.id.phoneNum_edit); 
		editText.setInputType(InputType.TYPE_NULL);
		keyboard_1=(Button)view.findViewById(R.id.keyboard_1);
		keyboard_2=(Button)view.findViewById(R.id.keyboard_2);
		keyboard_3=(Button)view.findViewById(R.id.keyboard_3);
		keyboard_4=(Button)view.findViewById(R.id.keyboard_4);
		keyboard_5=(Button)view.findViewById(R.id.keyboard_5);
		keyboard_6=(Button)view.findViewById(R.id.keyboard_6);
		keyboard_7=(Button)view.findViewById(R.id.keyboard_7);
		keyboard_8=(Button)view.findViewById(R.id.keyboard_8);
		keyboard_9=(Button)view.findViewById(R.id.keyboard_9);
		keyboard_xing=(Button)view.findViewById(R.id.keyboard_xing);
		keyboard_0=(Button)view.findViewById(R.id.keyboard_0);
		keyboard_jin=(Button)view.findViewById(R.id.keyboard_jin);
		keyboard_back=(ImageButton)view.findViewById(R.id.keyboard_back);
		keyboard_call=(ImageButton)view.findViewById(R.id.keyboard_call);
		keyboard_send=(ImageButton)view.findViewById(R.id.keyboard_send);

		keyboard_1.setOnClickListener(this);
		keyboard_2.setOnClickListener(this);
		keyboard_3.setOnClickListener(this);
		keyboard_4.setOnClickListener(this);
		keyboard_5.setOnClickListener(this);
		keyboard_6.setOnClickListener(this);
		keyboard_7.setOnClickListener(this);
		keyboard_8.setOnClickListener(this);
		keyboard_9.setOnClickListener(this);
		keyboard_xing.setOnClickListener(this);
		keyboard_0.setOnClickListener(this);
		keyboard_jin.setOnClickListener(this);
		keyboard_back.setOnClickListener(this);
		keyboard_call.setOnClickListener(this);
		keyboard_send.setOnClickListener(this);
		editText.setOnClickListener(this);
		
		return view;
		
	}


	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch (view.getId()) {
			case R.id.f2_btn_openDrawer:
				drawerLayout.openDrawer(Gravity.START);
				break;
			case R.id.keyboard_1:
				editText.append("1");
				break;
			case R.id.keyboard_2:
				editText.append("2");
				break;
			case R.id.keyboard_3:
				editText.append("3");
				break;
			case R.id.keyboard_4:
				editText.append("4");
				break;
			case R.id.keyboard_5:
				editText.append("5");
				break;
			case R.id.keyboard_6:
				editText.append("6");
				break;
			case R.id.keyboard_7:
				editText.append("7");
				break;
			case R.id.keyboard_8:
				editText.append("8");
				break;
			case R.id.keyboard_9:
				editText.append("9");
				break;
			case R.id.keyboard_xing:
				editText.append("*");
				break;
			case R.id.keyboard_0:
				editText.append("0");
				break;
			case R.id.keyboard_jin:
				editText.append("#");
				break;
			case R.id.keyboard_back://清除键监听
				StringBuilder sb = new StringBuilder(editText.getText().toString());
				int index = sb.length();
				if (index > 0) {
					sb.delete(index - 1, index);
					editText.setText(sb.toString());
					editText.setSelection(editText.getText().length());
				}
				break;
			case R.id.keyboard_call://拨打电话
				String number = editText.getText().toString();
				//用intent启动拨打电话
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
				startActivity(intent);
				break;

			case R.id.keyboard_send://发送短信
			{
				String numberSend = editText.getText().toString();
				Intent intent1 = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + numberSend));
				startActivity(intent1);
				break;
			}
			case R.id.phoneNum_edit: {

				transaction = getFragmentManager().beginTransaction();
				hideFragments(transaction);
				fragment_03 = new Fragment_03();
				transaction.add(R.id.fragment_left_content, fragment_03,"comment");
				transaction.commit();

				break;
			}
		}


	}
	/*
	private String numberedit=null;
	public void f2_editstring(String numberedit){
		this.numberedit=numberedit;
	}
	public void f2geteditnumber(String edittextString){


        editText.setText(edittextString);
    }
    */
	public void hideFragments(FragmentTransaction ft) {
		if (fragment_03 != null)
			ft.hide(fragment_03);
	}
}
