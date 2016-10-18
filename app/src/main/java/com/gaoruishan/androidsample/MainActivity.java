package com.gaoruishan.androidsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gaoruishan.androidsample.R;
import com.gaoruishan.androidsample.system.EmptyActivity;
import com.gaoruishan.androidsample.system.FullscreenActivity;
import com.gaoruishan.androidsample.system.ItemListActivity;
import com.gaoruishan.androidsample.system.LoginActivity;
import com.gaoruishan.androidsample.system.NavigationActivity;
import com.gaoruishan.androidsample.system.ScrollingActivity;
import com.gaoruishan.androidsample.system.SettingsActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void toLogin(View view) {
		startActivity(new Intent(this, LoginActivity.class));
	}

	public void toFullScreen(View view) {
		startActivity(new Intent(this, FullscreenActivity.class));
	}

	public void toItemList(View view) {
		startActivity(new Intent(this, ItemListActivity.class));
	}

	public void toNavigation(View view) {
		startActivity(new Intent(this, NavigationActivity.class));
	}

	public void toScrolling(View view) {
		startActivity(new Intent(this, ScrollingActivity.class));
	}

	public void toSettings(View view) {
		startActivity(new Intent(this, SettingsActivity.class));
	}

	public void toEmpty(View view) {
		startActivity(new Intent(this, EmptyActivity.class));
	}
}
