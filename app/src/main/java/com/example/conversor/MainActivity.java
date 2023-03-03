package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonL = findViewById(R.id.buttonL);
        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Longitud.class);
                startActivity(intent);
            }
        });

        Button buttonP = findViewById(R.id.buttonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Peso.class);
                startActivity(intent);
            }
        });

        Button buttonV = findViewById(R.id.buttonV);
        buttonV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Volumen.class);
                startActivity(intent);
            }
        });

        Button buttonT = findViewById(R.id.buttonT);
        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Temperatura.class);
                startActivity(intent);
            }
        });
        }
    }