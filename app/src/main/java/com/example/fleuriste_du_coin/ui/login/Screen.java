package com.example.fleuriste_du_coin.ui.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fleuriste_du_coin.MainActivity;
import com.example.fleuriste_du_coin.MainActivity2;
import com.example.fleuriste_du_coin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Screen extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        context = this;

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

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
    // retour en arrière avec la flèche
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}