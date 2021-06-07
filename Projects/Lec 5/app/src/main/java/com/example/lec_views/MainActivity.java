package com.example.lec_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.b1);
        textView = findViewById(R.id.tv1);
    }

    public void SomeOneIsThere(View view)
    {
        textView.setText("You Clicked the button");
    }
}