package com.example.medicmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
    ListView list;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        list = (ListView) findViewById(R.id.list);
        items = new ArrayList<String>();
        items.add("Nucleus Diagnostic Center");
        items.add("SonoScan Diagnostic Center");
        items.add("Habib Diagnostic Center");
        items.add("Khatri Diagnostic center");
        items.add("Kimaya Kidney Center");
        items.add("Abhinav Kidney Dialysis And Health Center ");
        items.add("Apex Kidney Care");
        items.add("Akshar Diagnostic Center");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        list.setAdapter(itemsAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(Main4Activity.this,MapsActivity4.class);
                startActivity(intent);
            }
        });
    }
}
