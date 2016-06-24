package com.example.strong.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_send);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button_send",Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button2",Toast.LENGTH_LONG).show();
            }
        });


        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button3",Toast.LENGTH_LONG).show();
            }
        });


        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button4",Toast.LENGTH_LONG).show();
            }
        });


        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button5",Toast.LENGTH_LONG).show();
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                makeText(getApplicationContext(),"Toast button6",Toast.LENGTH_LONG).show();
            }
        });
    }

}
