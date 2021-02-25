package com.example.lab_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    private Button button;
    private Intent i;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = findViewById(R.id.edit_text_line);

        this.button = findViewById(R.id.to_second_activity);
        i = new Intent(this, SecondActivity.class);

        button.setOnClickListener(v -> {


            // String s = editText.getText().toString();

            // "testString" is a key for SecondActivity
            // Log.i("MainActivity, "String: " + s);
            // i.putExtra("testString", s);

            // PART 1
            startActivity(i);
            startActivityForResult(i, REQUEST_CODE);
        });
    }

    // PART 2
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.i("MainActivity", "Result Code: " + resultCode);

        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();

            if (extras != null) {
                int imageID = extras.getInt("imageID");

                ConstraintLayout currentLayout = findViewById(R.id.);
                currentLayout.setBackground(getDrawable(imageID));
            }
        }
    }

    public void launchSecondActivity(View view) {
    }
}