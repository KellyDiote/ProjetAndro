package com.example.test1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
	private TextView coucou = null;
	@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			coucou = new TextView(this);
			coucou.setText("Salut Gogo !");
			}
}