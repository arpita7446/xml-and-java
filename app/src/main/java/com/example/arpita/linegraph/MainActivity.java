package com.example.arpita.linegraph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.arpita.linegraph.R.id.Linechart;

public class MainActivity extends AppCompatActivity {
    Linechart linechart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linechart = (Linechart) findViewById(R.id.Linechart);


    }
}