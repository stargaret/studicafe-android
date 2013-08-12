package com.studicafe.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CafeBoulevardActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cafeboulevard);
		
		Button enviro=(Button)findViewById(R.id.environ);
		Button chemistry=(Button)findViewById(R.id.chemistry);
		Button biology=(Button)findViewById(R.id.biology);
		Button physics=(Button)findViewById(R.id.physics);
		
		
		chemistry.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(CafeBoulevardActivity.this, MenuActivity.class);
				startActivity(intent);
				
			}
			
			
		});
		
		
		
	}

}
