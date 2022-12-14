package com.emprendefacil_api28.ui.galeria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.emprendefacil_api28.databinding.FragmentGaleriaBinding;
import com.emprendefacil_api28.databinding.FragmentGaleriaBinding;

public class GaleriaFragment extends Fragment {

    private FragmentGaleriaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GaleriaViewModel galeriaViewModel =
                new ViewModelProvider(this).get(GaleriaViewModel.class);

        binding = FragmentGaleriaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGaleria;
        galeriaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}