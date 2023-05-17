package com.example.bettercare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class oilySkin extends AppCompatActivity {
    TextView oilyData;
    ImageView oilyimg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oily_skin);

        oilyData=findViewById(R.id.oilyData);
        oilyimg2=findViewById(R.id.oilyimg2);

        oilyimg2.setImageResource(R.drawable.oily);

        oilyData.setText("Oily skin is the overproduction of sebum. \n\n"+"Causes: genetics, stress, hormonal changes and imbalances," +
                " makeups that may cause irritation, and medications . \n\n"+"Causes: genetics, stress, hormonal changes and imbalances," +
                " makeups that may cause irritation, and medications . \n\n"+"*Characteristics: Glossy shine. Prone to blackhead, whiteheads," +
                " and various forms of acne. \n\n"+"*How to care for oily skin*\n " +
                "- Cleanse your skin twice a day using mild soap to clean the oils /dirt from day activities . \n" +
                "- Read products in makeup to avoid any harsh chemicals. \n" +
                "- Use sun protection creams. \n" +
                "- Avoid touching your face too much. \n" +
                "- Have a well rested night.  Have a balanced and healthy diet. \n");
    }
}