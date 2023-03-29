package com.example.medicmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.list);
        items = new ArrayList<String>();
        items.add("Horizon Hospital");
        items.add("Jupiter Hospital");
        items.add("Hiranandani Hospital");
        items.add("Highland Super Speciality Hospital");
        items.add(" Oscar Medical Foundation & Research Center And Hospital");
        items.add("Sai Ashutosh  Hospital");
        items.add("Metropol Multispeciality Hospital");
        items.add("Thane Civil Hospital");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        list.setAdapter(itemsAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(ListActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}