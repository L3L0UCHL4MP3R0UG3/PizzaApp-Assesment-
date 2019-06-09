package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Menu extends AppCompatActivity {
    ListView list;
    String[] list1={"Plain Cheese","Crispy onion","Veggie delight","Golden chicken","Smoked meat","Spicy veg""BBQ delight","Cheesy Surprise","Mushroom farm","Cheese burst"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        list=(ListView)findViewById(R.id.lst);
        ArrayAdapter adapter=new ArrayAdapter(Menu.this,R.layout.list,list1);
        list.setAdapter(adapter);
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView text=(TextView)view;
                Toast.makeText(Menu.this,text.getText().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
