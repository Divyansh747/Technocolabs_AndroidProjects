package com.example.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button IncrementButton;
    Button DecrementButton;
    public int Number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1);
        IncrementButton =  findViewById(R.id.incrementButton);
        DecrementButton =  findViewById(R.id.decrementButton);


        IncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number += 1;
                textView1.setText(""+Number);
            }
        });

        DecrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number -= 1;
                textView1.setText(""+Number);
            }
        });

    }



    }
