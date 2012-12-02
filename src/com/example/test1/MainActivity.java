package com.example.test1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text1 = null;
	
	
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			text1 = (TextView)findViewById(R.id.text);
			text1.setPadding(250, 60, 10, 90);
			
			setContentView(R.layout.activity_main);			
			}
}