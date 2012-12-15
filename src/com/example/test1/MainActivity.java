package com.example.test1;

import android.app.Activity;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int currentProgress, newProgressValue = 10;
	private SeekBar seekBar_light;
	private TextView textView_seekBarValue;
	private SharedPreferences sharedPreferences;
	private String Key_PROGRESS = "key_progress";
	private String PREFERENCE_PROGRESS = "preference_progress";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		sharedPreferences = getSharedPreferences(PREFERENCE_PROGRESS,
				Context.MODE_PRIVATE);
		currentProgress = sharedPreferences.getInt(Key_PROGRESS, 10);

		setContentView(R.layout.activity_main);
		TextView temprecup = (TextView) findViewById(R.id.affichageLight);
		temprecup.setText("Luxmètre :" + RESTLETinterface.getLumInt());

		TextView tempaffiche = (TextView) findViewById(R.id.Fixerlight);
		RESTLETinterface.setValue("light", "setLevel", 100);
		tempaffiche
				.setText("Luxmètre réglé à :" + RESTLETinterface.getLumInt());

		TextView Buttonaffiche = (TextView) findViewById(R.id.Buttonuse);
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group);
		// On récupère l'identifiant du bouton qui est coché
		int id = radioGroup.getCheckedRadioButtonId();
		Buttonaffiche.setText("Bouton utilisé :" + id);

		textView_seekBarValue = (TextView) findViewById(R.id.SeekbarValue);
		seekBar_light = (SeekBar) findViewById(R.id.seekBar_light);
		seekBar_light.setMax(100);
		seekBar_light.setProgress(currentProgress);
		textView_seekBarValue.setText(String.valueOf(currentProgress));

		seekBar_light.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar seekBar) {

				newProgressValue = seekBar.getProgress();
				currentProgress = newProgressValue;
				SharedPreferences.Editor editor = sharedPreferences.edit();
				editor.putInt(Key_PROGRESS, newProgressValue);
				editor.commit();

			}

			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				textView_seekBarValue.setText(String.valueOf(seekBar
						.getProgress()));
				RESTLETinterface.setValue("light", "setLevel",
						seekBar.getProgress());

			}
		});

		radioGroup
				.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
					Button ButtonStores = (Button) findViewById(R.id.ButtonStores);
					public void onCheckedChanged(RadioGroup group, int id) {
						// En fonction de l'identifiant du RadioButton
						// sélectionné…
						if (id != 2131165194)
							ButtonStores.setEnabled(false);
						else ButtonStores.setEnabled(true);
					}
				});

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
