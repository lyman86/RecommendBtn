package com.example.recommendbutton;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RecommendBtn extends LinearLayout {
	// 有几行按钮
	private int mRows = 2;
	// 按钮的数量
	private int mCount;
	// 每行几个按钮
	private int btnRowCount = 3;
	// 按钮左右之间的间距
	private int leftMargin = 10;
	// 按钮上下之间的间距
	private int topMargin = 10;
	private Context context;

	public RecommendBtn(Context context) {
		super(context, null);
		this.context = context;
	}

	public RecommendBtn(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOrientation(LinearLayout.VERTICAL);
		this.context = context;
	}
	public void addChild(int rows, int btnRowCount, List<String> list,List<Integer>shapes) {
		TextView tv;
		LinearLayout linearLayout;
		int k = 0;
		for (int i = 0; i < rows; i++) {
			LayoutParams param1 = new LinearLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT, 1.0f);
			linearLayout = new LinearLayout(context);
			linearLayout.setOrientation(LinearLayout.HORIZONTAL);
			linearLayout.setLayoutParams(param1);
			
			for (int j = 0; j < btnRowCount; j++) {
				LayoutParams param2 = new LinearLayout.LayoutParams(
                        LayoutParams.MATCH_PARENT,
                        LayoutParams.MATCH_PARENT, 1.0f);
				tv = new TextView(context);
				param2.leftMargin = 20;
				param2.topMargin = 20;
				if ((k+1)%btnRowCount==0) {
					param2.rightMargin = 20;
				}
				if ((i+1)%rows==0) {
					param2.bottomMargin = 20;
				}
				tv.setTextSize(14);
				tv.setTextColor(Color.WHITE);
				tv.setGravity(Gravity.CENTER);
				tv.setBackgroundResource(shapes.get(k));
				tv.setText(list.get(k++));
				tv.setLayoutParams(param2);
				linearLayout.addView(tv);
			}
			addView(linearLayout);
		}
	}

}
