package com.example.mapbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.nio.channels.Selector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.mapFragment,new Mapfragment())
                    .replace(R.id.selectorFragment,new SelectorFragment()).commit();
        }
    }
}