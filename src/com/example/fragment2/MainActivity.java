package com.example.fragment2;


import com.example.fragment2.fragment.MessageFragment;
import com.example.fragment2.fragment.HomeFragment;
import com.example.fragment2.fragment.SettingFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;
	private LayoutInflater layoutInflater;

	// 定义数组来存放Fragment界面
	private Class fragmentArray[] = { HomeFragment.class,
			MessageFragment.class, SettingFragment.class };

	// 定义数组来存放按钮图片
	private int mImageViewArray[] = { R.drawable.tab_home_selector,
			R.drawable.tab_message_selector, R.drawable.tab_setting_selector };

	// Tab选项卡的文字
	private int mTextviewArray[] = { R.string.tab_home, R.string.tab_message,
			R.string.tab_setting };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	/**
	 * 初始化组件
	 */
	private void initView() {
		// 实例化布局对象
		layoutInflater = LayoutInflater.from(this);

		// 实例化TabHost对象，得到TabHost
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.container);

		for (int i = 0; i < fragmentArray.length; i++) {
			// 为每一个Tab按钮设置图标、文字和内容
			TabSpec taSpec = mTabHost.newTabSpec(getString(mTextviewArray[i]))
					.setIndicator(getTabItemView(i));
			// 将Tab按钮添加进Tab选项卡中
			mTabHost.addTab(taSpec, fragmentArray[i], null);
		}
	}

	/**
	 * 给Tab按钮设置图标和文字
	 */
	private View getTabItemView(int index) {
		View view = layoutInflater.inflate(R.layout.tab_item_view, null);
		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		imageView.setImageResource(mImageViewArray[index]);

		TextView textView = (TextView) view.findViewById(R.id.textview);
		textView.setText(getString(mTextviewArray[index]));

		return view;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
