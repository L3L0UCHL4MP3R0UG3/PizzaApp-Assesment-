package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Offer extends AppCompatActivity {
    TextView txt2;
    Spinner spin;
    String ofer[]={"Offer1","Offer2","Offer3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
        txt2=(TextView)findViewById(R.id.txt2);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter=new ArrayAdapter(Offer.this,R.layout.spin,ofer);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=((TextView)view);
                Toast.makeText(Offer.this,txt.getText().toString(), Toast.LENGTH_SHORT).show();

 }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
