package com.studicafe.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutUsActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aboutus);
		
		
		Button about=(Button)findViewById(R.id.about);
		Button study=(Button)findViewById(R.id.studycaf); 
		Button mystudy=(Button)findViewById(R.id.mystudy);
		
		
		study.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(AboutUsActivity.this, CafeBoulevardActivity.class);
				startActivity(intent);
				
			}
			
			
			
		});
		
		
		
		
	}
	

}
