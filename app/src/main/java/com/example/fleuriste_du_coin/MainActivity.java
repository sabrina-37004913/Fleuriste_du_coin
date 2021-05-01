package com.example.fleuriste_du_coin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fleuriste_du_coin.dataBase.DataBaseManager;
import com.example.fleuriste_du_coin.object.Boutique;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    //déclarer les vues
    Button contact;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact = findViewById(R.id.contact_us);
        context = this;
        //TextView BoutiquesView;
        //DataBaseManager databaseManager;

        //BottomNavigation
        BottomNavigationView bottomNavView = findViewById(R.id.bottom_navigation);
        //Perform ItemSelectedListener
        bottomNavView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {

                case R.id.navigation_liste_b:
                    startActivity(new Intent(context, MainActivity2.class));
                    return true;

                case R.id.navigation_home:
                    startActivity(new Intent(context, MainActivity.class));
                    return true;
            }
            return false;
        });
    }

        // un test de base de donnée qui fait crasher l'application
/*
        BoutiquesView = (TextView) findViewById( R.id.BoutiquesView );
        databaseManager = new DataBaseManager( context );

        databaseManager.insertBoutique( " La féerie des fleurs " , "Saint-André" , "Lilas" );
        databaseManager.insertBoutique( " Interflora " , "Saint-Suzanne" , " Roses " );

        // afficher toutes les boutiques
        List<Boutique> boutiques = databaseManager.read();
        for ( Boutique boutique : boutiques ) {
            BoutiquesView.append( boutique.toString() + "\n");
        }

        databaseManager.close();
    }
    */

        //fonction quand on clique sur le bouton nous contacter c'est censé rediriger vers la page
        // mais la page contact fait crasher l'application
        public void contacter (View view){
            Intent intent = new Intent(context, Message.class);
            startActivity(intent);
        }

}