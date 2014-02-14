package com.example.fragment2.fragment;

import com.example.fragment2.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MessageFragment extends Fragment {
	
	private View rootView;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v("MessageFragment", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v("MessageFragment", "onCreateView");
		if (rootView == null) {
			rootView = inflater.inflate(R.layout.fragment_message, container,
					false);
		} else {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null) {
				parent.removeView(rootView);
			}
		}
		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		Log.v("MessageFragment", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v("MessageFragment", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v("MessageFragment", "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.v("MessageFragment", "onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v("MessageFragment", "onPause");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.v("MessageFragment", "onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v("MessageFragment", "onStart");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.v("MessageFragment", "onStop");
		super.onStop();
	}
}
