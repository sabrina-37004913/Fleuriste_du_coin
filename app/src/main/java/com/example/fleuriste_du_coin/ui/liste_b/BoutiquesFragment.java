package com.example.fleuriste_du_coin.ui.liste_b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.fleuriste_du_coin.R;

public class BoutiquesFragment extends Fragment {

    private BoutiqueViewModel boutiqueViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        boutiqueViewModel =
                new ViewModelProvider(this).get(BoutiqueViewModel.class);
        View root = inflater.inflate(R.layout.fragment_liste_b, container, false);
        final TextView textView = root.findViewById(R.id.BoutiquesView);
        boutiqueViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}