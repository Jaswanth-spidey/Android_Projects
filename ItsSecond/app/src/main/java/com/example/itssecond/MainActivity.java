package com.example.itssecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    TextView tv1;
    Button b2;
    int a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.toast);
        tv1=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                tv1.setText(""+a);
            }
        });

        public void display(View )
        {
            //Action
            Toast.makeText(this,"Welcome to SRM",Toast.LENGTH_SHORT).show();
        }
    }
}
