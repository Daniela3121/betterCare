package com.example.bettercare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class secondPage extends AppCompatActivity {
    Button btn;
    Button figureoutSkin;
    ImageView img;
    ImageView normalType;
    ImageView oilyType;
    ImageView comboType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button nextbtn2;
      
        nextbtn2=findViewById(R.id.nextbtn2);
        normalType=findViewById(R.id.normal_type);
        oilyType=findViewById(R.id.oily_type);
        comboType=findViewById(R.id.combo_type);
        nextbtn2 = findViewById(R.id.nextbtn2);
        img = findViewById(R.id.nutrients);
        figureoutSkin=findViewById(R.id.figureoutSkinType);


        figureoutSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSkinTypes();
            }
        });


        normalType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNormal();
            }

        });

        oilyType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOily();
            }
        });

        comboType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCombo();
            }
        });

    }

    public void goToSkinTypes(){
        Intent i=new Intent(this, skinTypes.class);
        startActivity(i);}

    public void goToNormal(){
        Intent i=new Intent(this, normalSkin.class);
        startActivity(i);}

    public void goToOily(){
        Intent i=new Intent(this, oilySkin.class);
        startActivity(i);}

    public void goToCombo(){
        Intent i=new Intent(this, comboSkin.class);
        startActivity(i);}


//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goTonutrients();
//            }
//        });
//
//    }

//    public void goToSkinTypes() {
//        Intent i = new Intent(this, skinTypes.class);
//        startActivity(i);
//    }


    public void goTonutrients() {
        Intent i = new Intent(this, nutrients.class);
        startActivity(i);

    }

}



