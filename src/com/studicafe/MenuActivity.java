<<<<<<< HEAD
package com.studicafe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuActivity extends Activity {

=======
package com.studicafe.study;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends Activity {
	
>>>>>>> b03b895b46612e0ec30fbedc99addffa661bd63d
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
<<<<<<< HEAD
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
=======
		
		
		Button menubut=(Button)findViewById(R.id.menu);
		
		
		
>>>>>>> b03b895b46612e0ec30fbedc99addffa661bd63d
	}

}
