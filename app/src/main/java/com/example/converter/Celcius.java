package com.example.converter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Celcius extends AppCompatActivity {


    float f_celcius, f_kelvin, f_farenheit;
    TextView tx_celcius, tx_kelvin, tx_farenheit;
    EditText et_celciusInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);
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


    public void ConvertCelcius(View view){

        et_celciusInput = (EditText) findViewById(R.id.et_inputField);
        String inputValue = et_celciusInput.getText().toString();

        f_celcius = Float.parseFloat(inputValue);
        f_farenheit = (Float.parseFloat(inputValue) * 1.8f) + 32;
        f_kelvin = Float.parseFloat(inputValue) + 237.15f;

        SetText(f_celcius,f_kelvin, f_farenheit);
    }

    private void SetText(float celcius, float kelvin, float farenheit){

        tx_celcius = (TextView) findViewById(R.id.tx_celcius);
        tx_farenheit = (TextView) findViewById(R.id.tx_farenheit);
        tx_kelvin = (TextView) findViewById(R.id.tx_kelvin);

        tx_celcius.setText("Celcius : " + Math.round(celcius));
        tx_farenheit.setText("Farenheit : " + Math.round(farenheit));
        tx_kelvin.setText("Kelvin : " + Math.round(kelvin));
    }
}
