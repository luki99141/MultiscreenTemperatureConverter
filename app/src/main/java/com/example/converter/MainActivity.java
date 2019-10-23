package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SwitchToCelcius(View view){

        Intent i_celcius = new Intent(this, Celcius.class);
        this.startActivity(i_celcius);
    }

    public void SwitchToFarenheit(View view){

        Intent i_farenheit = new Intent(this, Farenheit.class);
        this.startActivity(i_farenheit);
    }
}
