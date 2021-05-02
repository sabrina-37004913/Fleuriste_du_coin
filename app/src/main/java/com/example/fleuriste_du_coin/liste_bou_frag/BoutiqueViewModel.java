package com.example.fleuriste_du_coin.liste_bou_frag;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BoutiqueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BoutiqueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" Vous êtes bien sur l'onglet de la liste des boutiques ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}