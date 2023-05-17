package com.example.bettercare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class normalSkin extends AppCompatActivity {

    TextView normalData;
    ImageView normalimg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_skin);

        normalData=findViewById(R.id.normalData);
        normalimg2=findViewById(R.id.normalimg2);
        normalimg2.setImageResource(R.drawable.normal);

        normalData.setText("Normal skin type is neither too oily or too dry. It's a balanced skin. \n\n"+"*Causes: A balanced level of fat, normal blood circulation, and good health. \n\n" +
                "*Characteristics:\n\n"+"Look has a smooth texture, " +
                "Fine pores, " +
                "No sensitive, " +
                "No blemishes, " +
                "Limited amount of breakouts\n\n"+"*How to care for normal skin*\n\n"+
                "-Take proper care, even though you aren’t prone to immediate breakouts\n" +
                "-Skincare could be limited \n" +
                "-Hydrate and stay healthy \n" +
                "-Find products that your skin loves \n" +
                "\n");
    }
}