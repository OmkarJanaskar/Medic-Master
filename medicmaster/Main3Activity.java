package com.example.medicmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ListView list;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list = (ListView) findViewById(R.id.list);
        items = new ArrayList<String>();
        items.add("Star CT Scan Center");
        items.add("Jupiter Scan center");
        items.add("Scandent Imaging");
        items.add("Criticare Center");
        items.add("Gokul Scan Center");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        list.setAdapter(itemsAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(Main3Activity.this,MapsActivity3.class);
                startActivity(intent);
            }
        });
    }
}
