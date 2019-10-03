package com.example.daggerintro.homes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.daggerintro.DaggerSComponent;
import com.example.daggerintro.R;
import com.example.daggerintro.SComponent;
import com.example.daggerintro.menu.FriedRice;

import javax.inject.Inject;

public class EbinHomeActivity extends AppCompatActivity {

    @Inject
    FriedRice friedRice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNextActivity();

        SComponent sComponent =  DaggerSComponent.builder().build();
        sComponent.inject(this);

        TextView textViewPlate =  findViewById(R.id.textViewPlate);
        textViewPlate.setText(friedRice.getFriedRice());

    }


    private void setupNextActivity() {
        ((Button) findViewById(R.id.buttonSwitchHome)).setOnClickListener(v -> {
            startActivity(new Intent(this, KiranHomeActivity.class));
        });
    }


}
