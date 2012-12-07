package com.example.test1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	public static final String EXTRA_MESSAGE ="com.example.myapp.MESSAGE";
		
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			// Création du listener pour le bouton "valider" et récupération et attachement
	        // de ce listener au bouton.
	}
			public boolean onCreateOptionsMenu(Menu menu){
				getMenuInflater().inflate(R.menu.activity_main, menu);
				return true;
			}
			public void pageSettings(View view){
				Intent intent=new Intent(this, Settings.class);
				startActivity(intent);
				
			}
	       }
