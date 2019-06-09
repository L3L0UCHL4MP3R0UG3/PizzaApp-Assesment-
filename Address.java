package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Address extends AppCompatActivity {
    TextView txt;
    Button btn;
    EditText hno,area,city,state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        txt=(TextView)findViewById(R.id.txt);
        btn=(Button)findViewById(R.id.btn);
        hno=(EditText)findViewById(R.id.hno);
        area=(EditText)findViewById(R.id.area);
        city=(EditText)findViewById(R.id.city);
        state=(EditText)findViewById(R.id.state);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h=hno.getText().toString();
                String a=area.getText().toString();
                String c=city.getText().toString();
                String s=state.getText().toString();

                if(TextUtils.isEmpty(h)){
                    txt.setText("ENTER HOUSE NO.");
                }
                else if(TextUtils.isEmpty(a)){
                    txt.setText("ENTER AREA");
                }
                else if(TextUtils.isEmpty(c)){
                    txt.setText("ENTER CITY");
                }
                else if(TextUtils.isEmpty(s)){
                    txt.setText("ENTER STATE");
                }
                else {
                    txt.setText("ADDRESS ADDED!!");
                }
            }
        });


    }
}
