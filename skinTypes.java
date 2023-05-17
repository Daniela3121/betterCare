package com.example.bettercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class skinTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_types);

        TextView yourstuff;
        TextView personal;
        Button nextbtn4;


        yourstuff=findViewById(R.id.yourStuff);
        personal=findViewById(R.id.personal);
        nextbtn4=findViewById(R.id.nextbtn4);

        nextbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNutrients();
            }
        });

        personal.setText("There are a few ways to figure out your skin type, one of the methods is The Blotting Sheet Method:  " +
                "This method is much faster and often an excellent differentiator between oily and dry skin types.\n\n " + "1. Gently pat " +
                "a blotting paper on the different areas of your face.\n\n"+" 2. Hold the sheet up to the light to determine how much oil is visible.\n\n" +
                " * So what's my skin type? * \n\n"+"If the sheet picked up little to no oil, you most likely have dry skin.\n\n"+"If the blotting sheet reveals oil from the forehead " +
                "and nose areas, your skin is normal/combination. Finally, if the blotting paper is saturated with oil, it is extremely likely that " +
                "you have oily skin.\n" +
                "\n \n"+"Now that you know your skin type you can get the right products, eat the right foods and take appropriate care of your skin, don't thank us 😉");



    }
    public void goToNutrients(){
        Intent i=new Intent(this, nutrients.class);
        startActivity(i);}
}