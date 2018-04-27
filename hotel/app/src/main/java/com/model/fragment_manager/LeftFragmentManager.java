package com.model.fragment_manager;

import com.model.activities.R;
import com.model.fragments.Fragment_Left_01;
import com.model.fragments.Fragment_Left_02;
import com.model.fragments.Fragment_Left_03;
import com.model.fragments.Fragment_Left_04;
import com.model.fragments.Fragment_Left_05;
import com.model.fragments.Fragment_Left_06;
import com.model.fragments.Fragment_Left_07;
import com.model.fragments.Fragment_Left_08;
import com.model.fragments.Fragment_Left_09;
import com.model.fragments.Fragment_Left_10;
import com.model.fragments.Fragment_Left_11;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class LeftFragmentManager {
	private FragmentManager fragmentManager;
	private FragmentTransaction transaction;
	private Fragment_Left_01 fragment_Left_01;
	private Fragment_Left_01 fragment_Left_02;
	private Fragment_Left_01 fragment_Left_03;
	private Fragment_Left_01 fragment_Left_04;
	private Fragment_Left_01 fragment_Left_05;
	private Fragment_Left_01 fragment_Left_06;
	private Fragment_Left_01 fragment_Left_07;
	private Fragment_Left_01 fragment_Left_08;
	private Fragment_Left_01 fragment_Left_09;
	private Fragment_Left_01 fragment_Left_10;
	private Fragment_Left_01 fragment_Left_11;
	
	public LeftFragmentManager(FragmentManager fragmentManager){
		this.fragmentManager=fragmentManager;
	}
	
	public void setFragmentSelection(int index){
		transaction=fragmentManager.beginTransaction();
		hideFragments(transaction);
		switch(index){
		case 0:
			if(fragment_Left_01==null){
				fragment_Left_01=new Fragment_Left_01();
				transaction.add(R.id.fragment_left_content, fragment_Left_01);
			}
			else{
				transaction.show(fragment_Left_01);	
			}
			break;
			
		case 1:
			if(fragment_Left_02==null){
				Fragment_Left_02 fragment_Left_02=new Fragment_Left_02();
				transaction.add(R.id.fragment_left_content, fragment_Left_02);
			}
			else{
				transaction.show(fragment_Left_02);		
			}
			break;
			
		case 2:
			if(fragment_Left_03==null){
				Fragment_Left_03 fragment_Left_03=new Fragment_Left_03();
				transaction.add(R.id.fragment_left_content, fragment_Left_03);
			}
			else{
				transaction.show(fragment_Left_03);		
			}
			break;
			
		case 3:
			if(fragment_Left_04==null){
				Fragment_Left_04 fragment_Left_04=new Fragment_Left_04();
				transaction.add(R.id.fragment_left_content, fragment_Left_04);
			}
			else{
				transaction.show(fragment_Left_04);		
			}
			break;
			
		case 4:
			if(fragment_Left_05==null){
				Fragment_Left_05 fragment_Left_05=new Fragment_Left_05();
				transaction.add(R.id.fragment_left_content, fragment_Left_05);
			}
			else{
				transaction.show(fragment_Left_05);		
			}
			break;
			
		case 5:
			if(fragment_Left_06==null){
				Fragment_Left_06 fragment_Left_06=new Fragment_Left_06();
				transaction.add(R.id.fragment_left_content, fragment_Left_06);
			}
			else{
				transaction.show(fragment_Left_06);		
			}
			break;
			
		case 6:
			if(fragment_Left_07==null){
				Fragment_Left_07 fragment_Left_07=new Fragment_Left_07();
				transaction.add(R.id.fragment_left_content, fragment_Left_07);
			}
			else{
				transaction.show(fragment_Left_07);		
			}
			break;
			
		case 7:
			if(fragment_Left_08==null){
				Fragment_Left_08 fragment_Left_08=new Fragment_Left_08();
				transaction.add(R.id.fragment_left_content, fragment_Left_08);
			}
			else{
				transaction.show(fragment_Left_08);		
			}
			break;
			
		case 8:
			if(fragment_Left_09==null){
				Fragment_Left_09 fragment_Left_09=new Fragment_Left_09();
				transaction.add(R.id.fragment_left_content, fragment_Left_09);
			}
			else{
				transaction.show(fragment_Left_09);		
			}
			break;
			
		case 9:
			if(fragment_Left_10==null){
				Fragment_Left_10 fragment_Left_10=new Fragment_Left_10();
				transaction.add(R.id.fragment_left_content, fragment_Left_10);
			}
			else{
				transaction.show(fragment_Left_10);		
			}
			break;
			
		case 10:
			if(fragment_Left_11==null){
				Fragment_Left_11 fragment_Left_11=new Fragment_Left_11();
				transaction.add(R.id.fragment_left_content, fragment_Left_11);
			}
			else{
				transaction.show(fragment_Left_11);		
			}
			break;
		
		}
		transaction.commit();
	}
	
	public void hideFragments(FragmentTransaction ft){
		if(fragment_Left_01!=null)
			ft.hide(fragment_Left_01);
		if(fragment_Left_02!=null)
			ft.hide(fragment_Left_02);
		if(fragment_Left_03!=null)
			ft.hide(fragment_Left_03);
		if(fragment_Left_04!=null)
			ft.hide(fragment_Left_04);
		if(fragment_Left_05!=null)
			ft.hide(fragment_Left_05);
		if(fragment_Left_06!=null)
			ft.hide(fragment_Left_06);
		if(fragment_Left_07!=null)
			ft.hide(fragment_Left_07);
		if(fragment_Left_08!=null)
			ft.hide(fragment_Left_08);
		if(fragment_Left_09!=null)
			ft.hide(fragment_Left_09);
		if(fragment_Left_10!=null)
			ft.hide(fragment_Left_10);
		if(fragment_Left_11!=null)
			ft.hide(fragment_Left_11);
	}

}
