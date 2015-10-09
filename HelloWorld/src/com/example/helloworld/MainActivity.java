package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	
	private Button bt1;
	private Button bt2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		bt1 = (Button)findViewById(R.id.button1);
		bt2 = (Button)findViewById(R.id.button2);
		
		bt1.setOnClickListener(new MyOnClickListener(){
			public void onClick(View v){
				super.onClick(v);
				Toast.makeText(MainActivity.this, "bt1 logic", 1).show();
			}
		});
		
		bt2.setOnClickListener(new MyOnClickListener(){
			public void onClick(View v){
				super.onClick(v);
				Toast.makeText(MainActivity.this, "bt2 logic", 1).show();
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i("tag", "Third type");
	}
}

class MyOnClickListener implements OnClickListener{

	@Override
	public void onClick(View v) {
		v.setAlpha(0.5f);
	}
	
}