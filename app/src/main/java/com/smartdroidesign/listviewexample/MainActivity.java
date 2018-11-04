package com.smartdroidesign.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List of Strings
        String[] foods = {"Bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};
        // ListAdapter converts the Strings to a List
        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        // Getting the reference
        ListView myListView = findViewById(R.id.list_food);
        // Se the Adapter to the converter
        myListView.setAdapter(myAdapter);


        // Setting up listener on the view
        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // Extracting string name
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        // Showing it as toast
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
