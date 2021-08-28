package com.omeraydmr.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omeraydmr.landmarkbook.databinding.ActivityDetailsBinding;
import com.omeraydmr.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


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