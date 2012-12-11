package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String b = RESTLETinterface.getLumInt();
		System.out.print("----------------RESTLET----------------"+b);
//	Button x = (Button)findViewById(R.id.ButtonLight);
//	x.setText(RESTLETinterface.getLumInt());
		TextView bite = (TextView)findViewById(R.id.affichageLight);
		bite.setText(RESTLETinterface.getLumInt());
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void pageSettings(View view) {
		Intent intent = new Intent(this, Settings.class);
		startActivity(intent);

	}
  
}
