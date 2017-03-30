package com.senegal.nagnekoseytoo.gabavailability.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.senegal.nagnekoseytoo.gabavailability.R;

public class OffresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offres);

        Button buttonGab= (Button ) findViewById(R.id.gab);
        Button buttonAutre= (Button ) findViewById(R.id.autre);

        buttonGab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OffresActivity.this, GabAvailabilityActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
        });

        buttonAutre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OffresActivity.this, AutreActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
        });
    }
}
