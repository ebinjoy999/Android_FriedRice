package com.example.daggerintro.homes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerintro.R;
import com.example.daggerintro.menu.FriedRice;

import javax.inject.Inject;

public class KiranHomeActivity extends AppCompatActivity {

    @Inject
    FriedRice friedRice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiran_home);
    }
}
