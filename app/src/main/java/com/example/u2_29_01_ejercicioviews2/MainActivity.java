package com.example.u2_29_01_ejercicioviews2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tvboton1,tvboton2,tvboton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificando vistas

        tvboton1 = (TextView)findViewById(R.id.textoprimero);
        tvboton2 = (TextView)findViewById(R.id.textosegundo);
        tvboton3 = (TextView)findViewById(R.id.textotercero);

    }//Fin OnCreate

    public void clickboton1 (View view){
        tvboton1.setText("Has pulsado el primer cohete");
    }
    public void clickboton2 (View view){
        tvboton2.setText("Has pulsado el segundo cohete");
    }
    public void clickboton3 (View view){
        tvboton3.setText("Has pulsado el tercer cohete");
    }

public void clickbotonerror (View view){
        tvboton1.setText("");
        tvboton2.setText("");
        tvboton3.setText("");
}

}//Fin Activity
