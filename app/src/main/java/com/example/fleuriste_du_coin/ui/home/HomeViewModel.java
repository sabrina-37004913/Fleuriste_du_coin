package com.example.fleuriste_du_coin.ui.home;

import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fleuriste_du_coin.ui.login.LoginActivity;

import static androidx.core.content.ContextCompat.startActivity;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();

        mText.setValue("L'application est en construction . Merci de retouner à l'accueil.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}