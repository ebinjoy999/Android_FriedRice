package com.example.daggerintro.homes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerintro.DaggerSwiggyBoyComponent;
import com.example.daggerintro.R;
import com.example.daggerintro.SwiggyBoyComponent;
import com.example.daggerintro.menu.FriedRice;
import com.example.daggerintro.qualifier.VegFriedRice;

import javax.inject.Inject;

public class KiranHomeActivity extends AppCompatActivity {


    @Inject
    @VegFriedRice
    FriedRice friedRice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiran_home);

        SwiggyBoyComponent swiggyBoyComponent =  DaggerSwiggyBoyComponent.builder().build();
        swiggyBoyComponent.inject(this);

        TextView textViewPlate =  findViewById(R.id.textViewPlate);
        textViewPlate.setText(friedRice.getFriedRice());

    }
}
