package com.wazedrifat.covid19;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {
	GridView gridView;
	String[] titles = {
			"উপসর্গসমূহ", "নিরাপত্তা", "প্রতিকারসমূহ", "আমার কি করোনা ভাইরাস আছে?",
			"কিভাবে ভাইরাস থেকে বাঁচা যায় ?", "জরুরি সেবাসমূহ", "সুস্থের সংখ্যা",
			"করোনা সম্পর্কে বিস্তারিত সংবাদ", "করোনার বিরুদ্ধে পদক্ষেপ"
	};
	int[] images = {
			R.drawable.symptomps, R.drawable.protections, R.drawable.preventions, R.drawable.doihavecorona,
			R.drawable.gotcurefromcorona, R.drawable.emergencycontact, R.drawable.curestatus,
			R.drawable.news, R.drawable.measures
	};

	public Dashboard() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

		gridView = view.findViewById(R.id.dashboardGridViewID);

		CustomDashboardGridViewAdapter adapter = new CustomDashboardGridViewAdapter(getContext(), titles, images);
		gridView.setAdapter(adapter);

		return view;
	}
}
