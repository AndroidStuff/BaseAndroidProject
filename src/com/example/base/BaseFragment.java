package com.example.base;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class BaseFragment extends Fragment implements OnClickListener {

	/****************************************************************
	 *
	 * Fragment Life-cycle methods below
	 *
	 ****************************************************************/

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(getClass().getSimpleName(), "In onActivityCreated(Bundle savedInstanceState)");
	}

	@Override
	public void onAttach(Context context) {
		// super.onAttach(context);
		Log.d(getClass().getSimpleName(), "In onAttach(Context context)");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(getClass().getSimpleName(), "In onCreate(Bundle savedInstanceState)");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(getClass().getSimpleName(), "In onDestroy()");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(getClass().getSimpleName(), "In onDestroyView()");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(getClass().getSimpleName(), "In onDetach()");
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		Log.d(getClass().getSimpleName(), "In onLowMemory()");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(getClass().getSimpleName(), "In onPause()");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(getClass().getSimpleName(), "In onResume()");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(getClass().getSimpleName(), "In onSaveInstanceState(Bundle outState)");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(getClass().getSimpleName(), "In onStart()");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(getClass().getSimpleName(), "In onStop()");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Log.d(getClass().getSimpleName(), "In onViewCreated(View view, Bundle savedInstanceState)");
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		Log.d(getClass().getSimpleName(), "In onViewStateRestored(Bundle savedInstanceState)");
	}

}
