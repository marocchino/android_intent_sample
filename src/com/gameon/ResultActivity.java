package com.gameon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView textView = (TextView)findViewById(R.id.TextView01);
        textView.setText(getIntent().getStringExtra("msg"));
    }
    public void finish(View target) {
    	finish();
    }
}