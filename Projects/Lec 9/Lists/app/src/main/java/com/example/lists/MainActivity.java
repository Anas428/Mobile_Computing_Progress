package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> friendsList;
    EditText editText;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);
        editText = findViewById(R.id.editText);

        String [] friends = {"Item1","Item2", "Item3","Item4", "Item5"};
        friendsList = new ArrayList<String>();
        friendsList.add("Array List item 1");
        friendsList.add("Array List item 2");

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendsList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("You Clicked ", friendsList.get(position));
                Intent intent = new Intent(MainActivity.this, MainActivity2.class );
                intent.putExtra("Friend's name", friendsList.get(position));
                startActivity(intent);
            }
        });

    }

    public void addFriend(View view)
    {
        friendsList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendsList);
    }
}