package com.miao.autocompletetextview;

import java.util.Objects;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {
	
	private AutoCompleteTextView acTextView;
	private String[] res = {"Beijing1", "Beijing2","Beijing3", "shanghai1", "shanghai2"};
	
	private MultiAutoCompleteTextView macTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		acTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res);
		
		acTextView.setAdapter(adapter);
		
		macTextView = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
		macTextView.setAdapter(adapter);
		macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}
}
