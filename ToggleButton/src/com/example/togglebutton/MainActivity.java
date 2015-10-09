package com.example.togglebutton;

import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore.Video.Thumbnails;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{

	private ToggleButton tb;
	private ImageView img;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tb = (ToggleButton)findViewById(R.id.toggleButton1);
		img = (ImageView)findViewById(R.id.imageView1);
		
		tb.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		img.setBackgroundResource(isChecked?R.drawable.p_large_sqp2_2341000001181261:R.drawable.ic_launcher);
	}	
}
