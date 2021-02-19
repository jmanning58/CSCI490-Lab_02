package com.example.lab_02;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class SecondActivity extends MainActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String s = i.getExtras().getString("testString");

        this.mTextView = findViewById(R.id.text);
        this.mTextView.setText(s);
    }
}