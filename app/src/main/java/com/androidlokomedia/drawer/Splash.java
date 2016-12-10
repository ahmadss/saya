package com.androidlokomedia.drawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent inten =  new Intent(Splash.this, MainActivity.class);
				startActivity(inten);
				finish();
			}
		}, 2000);
        
    }
}