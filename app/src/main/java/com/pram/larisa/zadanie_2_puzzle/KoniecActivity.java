package com.pram.larisa.zadanie_2_puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KoniecActivity extends AppCompatActivity {

    public final static String MESSAGE_KEY ="czas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec);
        Intent intent = getIntent();
        String czas = intent.getStringExtra(MESSAGE_KEY);
        TextView textView = findViewById(R.id.text1);
        textView.setText(czas);
    }

    public void runStart(View view) {
        final Intent testy = new Intent(this, PuzzleActivity.class);
        startActivity(testy);
    }
}
