package com.example.fleuriste_du_coin.ui.liste_b;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BoutiqueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BoutiqueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}