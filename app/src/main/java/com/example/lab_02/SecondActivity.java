package com.example.lab_02;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;
    private ImageView moon;
    private ImageView waterfall;
    private int imageID;

    private EditText badEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        // Accessing the key from MainActivity
        String s = i.getExtras().getString("testString");

        mTextView
        // Part 2
        this.moon = findViewById();
        this.moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the image id

                // set imageID to the image id

                finish();
            }
        });

        this.waterfall = findViewById();
        this.waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the image id

                // set imageID to the image id
                // imageID = R.drawable.waterfall;
                finish();
            }
        });



        this.mTextView = findViewById(R.id.textView2);
        this.mTextView.setText(s);

        // This will be null
        // badEditText = findViewById(R.id.plain_text_input);

        // This will throw null pointer
        // String s1 = badEditText.getText().toString();

        // finish();
    }
      // Part 2
//    @Override
//    public void finish() {
//        Intent intent = new Intent();
//        intent.putExtra("imageID", imageID;

//        setResult(RESULT_OK, intent);
//        super.finish();
//    }
}