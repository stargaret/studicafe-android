package com.studicafe;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	private final int DISPLAY_LENGTH = 2000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_welcome);

		/*
		 * New Handler to start the Menu-Activity and close this Splash-Screen
		 * after some seconds.
		 */
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				/* Create an Intent that will start the Menu-Activity. */
				/*
				 * Note: to test a different activity, replace
				 * LoginActivity.class
				 */
				Intent mainIntent = new Intent(WelcomeActivity.this, LoginActivity.class);
				WelcomeActivity.this.startActivity(mainIntent);
				// overridePendingTransition(R.anim.fade, R.anim.hold);
				finish();
			}
		}, DISPLAY_LENGTH);

	}
}
