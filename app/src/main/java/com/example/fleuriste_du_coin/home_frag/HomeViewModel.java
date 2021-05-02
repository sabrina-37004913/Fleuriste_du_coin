package com.example.fleuriste_du_coin.home_frag;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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