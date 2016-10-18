package com.gaoruishan.androidsample.system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.gaoruishan.androidsample.R;

public class EmptyActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_empty);
	}

	public void sayHello(View v) {
		TextView textView = (TextView) findViewById(R.id.textView);
		EditText editText = (EditText) findViewById(R.id.editText);
		textView.setText("Hello, " + editText.getText().toString() + "!");
	}
}
