package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    EditText editName, editAge;
    Switch aSwitch;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btnadd);
        button2 = findViewById(R.id.btnView);
        editAge = findViewById(R.id.editNumber);
        editName = findViewById(R.id.editName);
        aSwitch = findViewById(R.id.switch1);

        button1.setOnClickListener(new View.OnClickListener() {
            CustomerModel customerModel;
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this, "Add Button Clicked", Toast.LENGTH_SHORT).show();
                customerModel = new CustomerModel(editName.getText().toString(), Integer.parseInt(editAge.getText().toString()), aSwitch.isChecked(), 1);
                Toast.makeText(MainActivity.this, customerModel.toString(), Toast.LENGTH_LONG);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "View Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}