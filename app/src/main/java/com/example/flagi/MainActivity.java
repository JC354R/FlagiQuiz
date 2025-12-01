package com.example.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void poprawnaOdpowiedz(View view) {
        Toast.makeText(this, R.string.ostrzezenie, Toast.LENGTH_SHORT).show();
    }

    public void zlaOdpowiedzUkryj(View view) {
        //Toast.makeText(this, "Ten przycisk jest poprawny", Toast.LENGTH_SHORT).show();
        view.setVisibility(view.INVISIBLE);
    }
}