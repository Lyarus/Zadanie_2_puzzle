package com.pram.larisa.zadanie_2_puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KoniecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec);
    }

    public void runStart(View view) {
        final Intent testy = new Intent(this, PuzzleActivity.class);
        startActivity(testy);
    }
}
