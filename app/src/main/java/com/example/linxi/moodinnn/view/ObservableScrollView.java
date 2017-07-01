package com.example.linxi.moodinnn.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.example.linxi.moodinnn.callback.OnScrollChangedListener;

/**
 * Created by linxi on 2017/7/2.
 */

public class ObservableScrollView extends ScrollView {
	private OnScrollChangedListener onScrollChangedListener;
	public ObservableScrollView(Context context) {
		super(context);
	}

	public ObservableScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ObservableScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		super.onScrollChanged(l, t, oldl, oldt);
		if (this.onScrollChangedListener!=null){
			onScrollChangedListener.onScrollChanged(t,oldt);
		}
	}
	public void setOnScrollChangedListener(OnScrollChangedListener onScrollChangedListener){
		this.onScrollChangedListener=onScrollChangedListener;
	}
}
