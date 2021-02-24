package com.example.lab_02;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
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

        // Part 2
        this.moon = findViewById(R.id.the_moon);

        this.moon.setOnClickListener(v -> {
            // get the image id
            imageID = R.drawable.supermoon;
            finish();
        });

        this.waterfall = findViewById(R.id.the_waterfall);

        this.waterfall.setOnClickListener(v -> {
            // get the image id
            imageID = R.drawable.waterfall;
            finish();
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