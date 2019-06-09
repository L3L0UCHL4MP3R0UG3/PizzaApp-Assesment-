package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,con,inf;
    Button adr,men,of,call,fb,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.txt1);
        con=(TextView)findViewById(R.id.con);
        adr=(Button)findViewById(R.id.adr);
        of=(Button)findViewById(R.id.of);
        men=(Button)findViewById(R.id.men);
        call=(Button)findViewById(R.id.call);
        fb=(Button)findViewById(R.id.fb);
        mail=(Button)findViewById(R.id.mail);
        inf=(TextView)findViewById(R.id.inf);

        adr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Address.class);
                startActivity(i);
            }
        });

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,Menu.class);
                startActivity(j);
            }
        });

        of.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,Offer.class);
                startActivity(k);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText("+918947340900");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText("https://facebook.com/pizzasso01");
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inf.setText("pizzasso@gmail.com");
            }
        });


    }
}
