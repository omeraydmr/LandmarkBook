package com.omeraydmr.landmarkbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.omeraydmr.landmarkbook.databinding.ActivityDetailsBinding;
import com.omeraydmr.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.N)
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
        Landmark saracoglu = new Landmark("Saracoglu Stadium", "Istanbul-Turkey", R.drawable.saracoglu);

        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(galatatower);
        landmarkArrayList.add(haydarpasa);
        landmarkArrayList.add(saracoglu);

        //Adapter
            //ListView
                //Mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,landmarkArrayList.get(i).name,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);
            }
        });

    }
}