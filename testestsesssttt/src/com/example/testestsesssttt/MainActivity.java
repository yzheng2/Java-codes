package com.example.testestsesssttt;

import javax.security.auth.PrivateCredentialPermission;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView autosingle;
	private String[] res = {"nichousha", "chounizadi", "zaichouyishishi", "shishijiushishi"};
	private MultiAutoCompleteTextView automulti;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		autosingle = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, res);
		
		automulti = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
		autosingle.setAdapter(adapter);
		automulti.setAdapter(adapter);
		automulti.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
	}
}
