package com.emprendefacil_api28.ui.galeria;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GaleriaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GaleriaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is GALERIA fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}