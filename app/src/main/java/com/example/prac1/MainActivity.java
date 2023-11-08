package com.example.prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3;
    RadioGroup radioGroup;

    Button button1;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radigroup);
        button1 = findViewById(R.id.submit);
        spinner1 = findViewById(R.id.iteam1);
        spinner2 = findViewById(R.id.iteam2);
        spinner3 = findViewById(R.id.iteam3);

        //For Radiogroup

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioButton radioButton =findViewById(i);

                Toast.makeText(MainActivity.this,"you have selected" + radioButton.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });


        //for spinner1

        String [] Course1 = {"A","B","C"};

        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Course1);
        spinner1.setAdapter(adapter);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Intent",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            }
        });

    }
}