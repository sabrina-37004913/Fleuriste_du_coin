package com.example.fleuriste_du_coin;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Message extends AppCompatActivity {

    //declaration des vues
    EditText  myTextSubject, myTextMessage;
    Button mySendButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_contact);
            ActionBar actionBar = getSupportActionBar();

            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
            }

            //Initialise les vues
            myTextSubject = findViewById(R.id.edit_text_subject);
            myTextMessage = findViewById(R.id.edit_text_message);
            mySendButton = findViewById(R.id.contact_us);

            // quand on clique sur envoyez on lance sendMail
            mySendButton.setOnClickListener(v -> sendMail());
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    super.onBackPressed();
                    break;
            }
        return super.onOptionsItemSelected(item);
        }

        public void sendMail(){
            String[] mails = { "nomprenom@gmail.com" };

            Intent email = new Intent(Intent.ACTION_SEND);
            email.setType("text/plain");
            email.putExtra(Intent.EXTRA_EMAIL,mails);
            email.putExtra(Intent.EXTRA_SUBJECT, myTextSubject.getText().toString().trim());
            email.putExtra(Intent.EXTRA_TEXT, myTextMessage.getText().toString().trim());


            try {
                //si pas d'erreur , on start notre intent
                startActivity(Intent.createChooser(email,"Veuillez choisir une application"));
            }
            catch (Exception e){
                // message d'erreir s'il y a un problème
                Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }