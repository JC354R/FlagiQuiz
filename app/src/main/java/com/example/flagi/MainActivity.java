package com.example.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    TextView textViewPolecenie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPolecenie = findViewById(R.id.textViewPolecenie);
    }

    public void poprawnaOdpowiedz(View view) {
        Toast.makeText(this, R.string.ostrzezenie, Toast.LENGTH_SHORT).show();
    }

    public void zlaOdpowiedzUkryj(View view) {
        //Toast.makeText(this, "Ten przycisk jest poprawny", Toast.LENGTH_SHORT).show();
        view.setVisibility(view.INVISIBLE);
        licznik++;
        if(licznik == 4){
            Toast.makeText(this, "Brawo to jest flaga polski!!!", Toast.LENGTH_SHORT).show();
            textViewPolecenie.setText(R.string.gratulacje);
        }
    }
}