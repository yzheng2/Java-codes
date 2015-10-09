package com.example.onclickinterface;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.location.GpsStatus.Listener;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button loginButton;
	private ImageButton imgbt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
	
	loginButton = (Button)findViewById(R.id.button1);
	imgbt = (ImageButton)findViewById(R.id.imageButton1);
	
	loginButton.setOnClickListener(listener);
	imgbt.setOnClickListener(this);
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Log.i("tag", "Outer class is launched");
		}
	};
	
	@Override
	public void onClick(View v) {
		Log.i("tag", "Third type");
	}
	
	
}
