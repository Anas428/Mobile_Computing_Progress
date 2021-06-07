package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    int count;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC", "OnStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC", "OnResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC", "OnPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC", "OnStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC", "OnDestroy Called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value", count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        if(savedInstanceState != null)
        {
            count = savedInstanceState.getInt("value");
            textView.setText(String.valueOf(count));
        }
    }

    public void IncreaseNumber(View view) {
        count = Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
    }

    public void GotoActivity2(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void GotoActivity3(View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}