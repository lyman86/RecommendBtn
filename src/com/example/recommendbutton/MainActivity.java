package com.example.recommendbutton;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    private RecommendBtn recommendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recommendBtn = (RecommendBtn) findViewById(R.id.reBtn);
        recommendBtn.addChild(2, 3, getData(),getColors());
    }
	private List<Integer> getColors() {
		List<Integer>list = new ArrayList<Integer>();
		list.add(R.drawable.shape);
		list.add(R.drawable.shape2);
		list.add(R.drawable.shape3);
		list.add(R.drawable.shape4);
		list.add(R.drawable.shape5);
		list.add(R.drawable.shape6);
		return list;
	}
	private List<String> getData() {
		List<String>list = new ArrayList<String>();
		for (int i = 0; i < 6; i++) {
			list.add(i+"");
		}
		return list;
	}


}
