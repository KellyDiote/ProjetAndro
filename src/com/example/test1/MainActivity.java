package com.example.test1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			// Création du listener pour le bouton "valider" et récupération et attachement
	        // de ce listener au bouton.
	        OnClickListener connexionListener = new OnClickListener() {
			
	            private Intent page_lumiere;

				/** Action effectuée lors du clic sur le bouton Valider
                 *  @param actualView - Vue dans laquelle on se trouve
                 */
	            {
	            	
	            			
	            }
                public void onClick(View activity_main) {
                                               
                     
                        startActivity(page_lumiere);
                        setContentView(R.layout.page_lumiere);
                        //startActivity(intent);
                }
			
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
	        }	;	
			}
}