package com.example.linxi.moodinnn.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.example.linxi.moodinnn.R;
import com.example.linxi.moodinnn.interfaces.BaseInterface;

/**
 * Created by linxi on 2017/7/2.
 */

public class BaseActivity extends FragmentActivity implements BaseInterface {

	private Dialog loadBar=null;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	public void SkipActivityforClass(Context context,Class<?> clazz){
		Intent intent=new Intent();
		intent.setClass(context,clazz);
		startActivity(intent);
	}

	public void initProgressDialog(){
		if (loadBar==null){
			loadBar=new Dialog(this, R.style.load_dialog);
			LayoutInflater inflater=this.getLayoutInflater();
			View view=inflater.inflate(R.layout.loadlayout,null);
			loadBar.setContentView(view);
			loadBar.setCancelable(false);
			loadBar.show();
		}else {
			loadBar.show();
		}
	}
	public void close(){
		if (loadBar!=null){
			if (loadBar.isShowing()){
				loadBar.dismiss();
			}
		}
	}

	@Override
	public void initViews() {

	}

	@Override
	public void initData() {

	}
}
