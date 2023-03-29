package com.example.medicmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView list;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list = (ListView) findViewById(R.id.list);
        items = new ArrayList<String>();
        items.add("Navjivan Blood Bank");
        items.add("Bloodline Charitable Blood bank ");
        items.add("Triumph Blood Bank");
        items.add("Vaidya Blood Bank");
        items.add("WamanRao Oka RaktPedhi");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        list.setAdapter(itemsAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Main2Activity.this, MapsActivity2.class);
                startActivity(intent);
            }
        });
    }
}
