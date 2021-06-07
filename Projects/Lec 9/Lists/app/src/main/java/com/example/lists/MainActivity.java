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
        String [] friends = {"Item1","Item2", "Item3","Item4", "Item5"};
        ArrayList<String> friendsList = new ArrayList<String>();
        friendsList.add("Array List item 1");
        friendsList.add("Array List item 2");
        friendsList.add("Array List item 3");
        friendsList.add("Array List item 4");
        friendsList.add("Array List item 5");
        friendsList.add("Array List item 6");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendsList);
        listView.setAdapter(arrayAdapter);

    }
}