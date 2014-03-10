package net.infobosccoma.holamon;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnObrir;
	
	
	@Override
	
	
	protected void onCreate(Bundle savedInstanceState) {
		//Guarda l'estat de l'aplicació per si pasa a segon terme poder recurperlar-la 
		//sense perdre dades
		super.onCreate(savedInstanceState);
		//Avisa a l'aplicacion quina vista tindra
		setContentView(R.layout.activity_main);
		
		btnObrir = (Button)findViewById(R.id.btnObrir);
		btnObrir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//				startActivity(new Intent(MainActivity.this,SecondActivity.class ));
				

			}
		}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
