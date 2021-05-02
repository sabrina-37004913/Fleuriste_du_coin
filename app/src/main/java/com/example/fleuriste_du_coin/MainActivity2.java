package com.example.fleuriste_du_coin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.fleuriste_du_coin.dataBase.DataBaseManager;
import com.example.fleuriste_du_coin.object.Boutique;
import com.example.fleuriste_du_coin.login_pages.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context=this;
        TextView BoutiquesView;
        DataBaseManager database;

        BottomNavigationView navView = findViewById(R.id.nav_view);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }


        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.navigation_liste_b:
                        startActivity(new Intent(context, MainActivity2.class));
                        return true;

                    case R.id.navigation_home:
                        startActivity(new Intent(context, MainActivity.class));
                        return true;
                }
                return false;
            }
        });


        //  base de donnée qui ne s'affiche pas ?
        BoutiquesView = (TextView) findViewById( R.id.BoutiquesView );
        database = new DataBaseManager( context );

        // afficher toutes les boutiques
        List<Boutique> boutiques = database.read();
        for ( Boutique boutique : boutiques ) {
            BoutiquesView.append( boutique.toString() + "\n");
        }

        database.close();

    }

    // retour en arrière avec la flèche
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void seco(View view){
        Intent intent =new Intent(context, LoginActivity.class);
        startActivity(intent);
    }

}