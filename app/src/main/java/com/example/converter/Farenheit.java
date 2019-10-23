package com.example.converter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Farenheit extends AppCompatActivity {

    TextView tv_celcius, tv_farenheit, tv_kelvin;
    EditText et_inputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farenheit);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void ConvertFarenheit(View view){

        et_inputField = findViewById(R.id.et_farenheitInput);
        String inputValue = et_inputField.getText().toString();

        float f_kelvin, f_celcius_, f_farenheit;

        f_celcius_ = (Float.parseFloat(inputValue) - 32) / 1.8f;
        f_kelvin = (Float.parseFloat(inputValue) + 459.67f) * 5/9;
        f_farenheit = (Float.parseFloat(inputValue));

        SetText(f_celcius_, f_kelvin, f_farenheit);
    }

    private void SetText(float celcius, float kelvin, float farenheit){

        tv_celcius = (TextView) findViewById(R.id.tx_celcius2);
        tv_farenheit = (TextView) findViewById(R.id.tx_farenheit2);
        tv_kelvin = (TextView) findViewById(R.id.tx_kelvin2);

        tv_celcius.setText("Celcius : " + Math.round(celcius));
        tv_farenheit.setText("Farenheit : " + Math.round(farenheit));
        tv_kelvin.setText("Kelvin : " + Math.round(kelvin));
    }

}
