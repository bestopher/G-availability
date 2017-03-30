package com.senegal.nagnekoseytoo.gabavailability.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.senegal.nagnekoseytoo.gabavailability.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAccueil= (Button ) findViewById(R.id.accueil);
        Button buttonLogin= (Button ) findViewById(R.id.login);
        Button buttonOffre= (Button ) findViewById(R.id.offre);
        Button buttonApropos= (Button ) findViewById(R.id.apropos);

        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccueilActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
        });

        buttonOffre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,OffresActivity.class);
        //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
    });

        buttonApropos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AproposActivity.class);
                //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
                startActivity(intent);
            }
        });
    }
}
