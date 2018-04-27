package com.model.adapters;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{
	private List<Fragment> fragments;

	public ViewPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
		super(fm);
		this.fragments=fragments;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO 自动生成的方法存根
		return fragments.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		return fragments.size();
	}

}
