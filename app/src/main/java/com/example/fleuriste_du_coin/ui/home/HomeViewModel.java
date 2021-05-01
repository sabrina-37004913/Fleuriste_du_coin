package com.example.fleuriste_du_coin.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();

        mText.setValue("Vous êtes sur le deuxième onglet , Liste des boutiques pour l'instant vide ! L'application est en construction . Veuillez retouner sur l'accueil s'il vous plaît");
    }

    public LiveData<String> getText() {
        return mText;
    }
}