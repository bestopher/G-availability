package com.senegal.nagnekoseytoo.gabavailability.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.senegal.nagnekoseytoo.gabavailability.R;
import com.senegal.nagnekoseytoo.gabavailability.Services.BackgroundLocationService;

import java.util.ArrayList;
import java.util.List;

public class GabAvailabilityActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gab_availability);

        Button buttonMap= (Button ) findViewById(R.id.validation);

        buttonMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GabAvailabilityActivity.this, MapActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);

                Intent geoIntent=new Intent(GabAvailabilityActivity.this,BackgroundLocationService.class);
                startActivity(geoIntent);


            }
        });


        spinner = (Spinner) findViewById(R.id.spinner);


        spinner.setOnItemSelectedListener(GabAvailabilityActivity.this);

        // Spinner Drop down elements
        List<String> regions=new ArrayList<String>();
        regions.add("Choisissez une region");
        regions.add("Dakar");
        regions.add("Diourbel");
        regions.add("Kafrine");
        regions.add("Kolda");
        regions.add("Kaolack");
        regions.add("Louga");
        regions.add("Matam");
        regions.add("Saint Louis");
        regions.add("Sedhiou");
        regions.add("Tambacounda");
        regions.add("Touba");
        regions.add("Thies");
        regions.add("Ziguinchor");
        regions.add("");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(GabAvailabilityActivity.this, android.R.layout.simple_spinner_item, regions);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();
        switch (item){
            case "choisissez une region":

                //Implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
            case "Dakar":
               //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;

            case "Diourbel":

                //Implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
            case "Kafrine":
                //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;

            case "Kolda":

                //Implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
            case "Kaolack":
                //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;

            case "Matam":

                //Implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
            case "Saint Louis":
                //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;

            case "Sedhiou":
                //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;

            case "Tambacounda":

                //Implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
            case "Ziguinchor":
                //implementer

                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
