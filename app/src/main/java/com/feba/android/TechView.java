package com.feba.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TechView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_view);

        SubDomain subDomain = getIntent().getParcelableExtra("DIR");
        String data = subDomain.getTechnology();
        TextView txtTech = findViewById(R.id.techTechView);
        txtTech.setText(data);
    }
}