package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answerWordCount = extras.getString("answer");
        Log.d("Word count:", answerWordCount);

        // get the answer and assign it to answerWordCount variable:
        TextView answerTextView = findViewById(R.id.text_result);
        // setting view to display the answer:
        answerTextView.setText(answerWordCount);

    }
}
