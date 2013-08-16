package com.studicafe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MenuActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;


        //Button menubut = (Button) findViewById(R.id.menu_settings);

    }

}
