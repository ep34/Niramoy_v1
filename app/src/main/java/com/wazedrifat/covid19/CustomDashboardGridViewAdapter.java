package com.wazedrifat.covid19;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

class CustomDashboardGridViewAdapter extends BaseAdapter {
	Context context;
	int cnt = 9;
	String[] titles;
	int[] images;
	LayoutInflater inflater;

	public CustomDashboardGridViewAdapter(Context context, String[] titles, int[] images) {
		this.context = context;
		this.titles = titles;
		this.images = images;
	}


	@Override
	public int getCount() {
		return cnt;
	}

	@Override
	public Object getItem(int i) {
		return null;
	}

	@Override
	public long getItemId(int i) {
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		if (view == null) {
			inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.simplelayout, viewGroup, false);
		}

		ImageView imageView = view.findViewById(R.id.layoutImageViewID);
		TextView textView = view.findViewById(R.id.layoutTextViewID);

		imageView.setImageResource(images[i]);
		textView.setText(titles[i]);

		return view;
	}
}
