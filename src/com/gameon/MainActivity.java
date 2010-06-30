package com.gameon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void goResult(View target) {
		Intent intent = new Intent(MainActivity.this,ResultActivity.class);
		intent.setAction(Intent.ACTION_VIEW);
		EditText editText = (EditText)findViewById(R.id.EditText01);
		intent.putExtra("msg",editText.getText().toString());
		startActivity(intent);
	}
}