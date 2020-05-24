package com.example.examapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView12;
    EditText editText2;
    CheckBox checkBox, checkBox2, checkBox3;
    RadioButton radioButton, radioButton2, radioButton3, radioButton8, radioButton9;
    RadioButton radioButton10, radioButton11, radioButton12, radioButton13;
    public int Score=0;
    String strInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView12 = findViewById(R.id.textView12);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton8 = findViewById(R.id.radioButton8);
        radioButton9 = findViewById(R.id.radioButton9);
        radioButton10 = findViewById(R.id.radioButton10);
        radioButton11 = findViewById(R.id.radioButton11);
        radioButton12 = findViewById(R.id.radioButton12);
        radioButton13 = findViewById(R.id.radioButton13);
        editText2 = findViewById(R.id.editText2);
        button =  findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (button.isEnabled()) {
                        button.setEnabled(false);
                    }

                    if ((checkBox.isChecked() && checkBox3.isChecked())) {
                        Score = Score+1;
                    }
                    else {
                        //Nothing
                    }

                    if ((radioButton3.isChecked())){
                        Score+=1;
                    }

                    if ((radioButton8.isChecked())){
                        Score+=1;
                    }

                    if((radioButton12.isChecked())){
                        Score+=1;
                    }

                    strInput = editText2.getText().toString();

                    if((strInput.equals("9000"))) {
                        Score+=1;
                    }


                textView12.setText(""+Score);
                Toast.makeText(getApplicationContext(),
                        "Your Score is: "+Score,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}

