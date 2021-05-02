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


        public void contacter (View view){
            Intent intent = new Intent(context, Message.class);
            startActivity(intent);
        }

}