package com.omeraydmr.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark ayasofya = new Landmark("Ayasofya", "Istanbul-Turkey", R.drawable.ayasofya);
        Landmark galatatower = new Landmark("Galata Tower", "Istanbul-Turkey", R.drawable.galatatower);
        Landmark haydarpasa = new Landmark("Haydarpasa", "Istanbul-Turkey", R.drawable.hadarpasa);
        Landmark saracoglu = new Landmark("Saracoglu Staadium", "Istanbul-Turkey", R.drawable.saracoglu);

        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(galatatower);
        landmarkArrayList.add(haydarpasa);
        landmarkArrayList.add(saracoglu);

    }
}