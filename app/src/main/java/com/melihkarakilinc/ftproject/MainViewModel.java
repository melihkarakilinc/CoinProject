package com.melihkarakilinc.ftproject;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    MainRespository repository;

    public MainViewModel() {
        //setupNextDates();
        repository = new MainRespository();
    }

    MutableLiveData<Root> ETHMainResponse;
    MutableLiveData<Root> BTZMainResponse;

    public LiveData<Root> getETHResponse() {

        if (ETHMainResponse == null) {
            ETHMainResponse = repository.requestETH();
        }
        return ETHMainResponse;
    }

    public LiveData<Root> getBTZResponse() {

        if (BTZMainResponse == null) {
            BTZMainResponse = repository.requestBTZ();
        }
        return BTZMainResponse;
    }
}
