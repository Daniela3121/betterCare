package com.example.bettercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nextbtn;

        nextbtn=findViewById(R.id.nextbtn);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecond();
            }
        });   

    }

    public void goToSecond(){
        Intent i=new Intent(this, secondPage.class);
        startActivity(i);}
}



