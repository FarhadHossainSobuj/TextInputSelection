package com.example.textinputselection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity {

    private FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadingTextView = findViewById(R.id.fading_text_view);

    }

    public void startExample2(View v){
        String[] example2 = {"And", "this", "is", "example 2"};
        fadingTextView.setTexts(example2);
        fadingTextView.setTimeout(300, FadingTextView.MILLISECONDS);
    }
}
