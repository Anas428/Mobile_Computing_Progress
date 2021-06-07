package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);
        String [] friends = {"Taskeen","Hina", "Honey","Anas", "Anas ki jaan"};
        ArrayList<String> friendsList = new ArrayList<String>();
        friendsList.add("Hina Meri jaan");
        friendsList.add("Taskeen Meri jaan ");
        friendsList.add("Meri jan Taskeen");
        friendsList.add("Anas");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);
        listView.setAdapter(arrayAdapter);

    }
}