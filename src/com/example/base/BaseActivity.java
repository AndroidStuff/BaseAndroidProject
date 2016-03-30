package com.example.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;

public abstract class BaseActivity extends Activity {

	private ProgressDialog progressDialog;
	private boolean destroyed = false;

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(getClass().getSimpleName(), "In onDestroy()");
		destroyed = true;
	}

	protected void showProgressDialog(CharSequence message) {
		Log.d(getClass().getSimpleName(), "In showProgressDialog(..)");
		if (progressDialog == null) {
			progressDialog = new ProgressDialog(this);
			progressDialog.setIndeterminate(true);
		}
		progressDialog.setMessage(message);
		progressDialog.show();
	}

	protected void dismissProgressDialog() {
		Log.d(getClass().getSimpleName(), "In dismissProgressDialog()");
		if (progressDialog != null && !destroyed) {
			progressDialog.dismiss();
		}
	}

}
