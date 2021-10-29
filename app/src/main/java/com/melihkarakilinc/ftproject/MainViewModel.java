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
    //Değerler
    public MutableLiveData<String> Ea1 = new MutableLiveData<>();

    //MutableLiveData<String> Ea1;
    MutableLiveData<String> Ea2;
    MutableLiveData<String> Ea3;

    MutableLiveData<Root> ETHMainResponse;
    MutableLiveData<Root> BTZMainResponse;

    public LiveData<Root> getETHResponse() {

        if (ETHMainResponse == null) {
            ETHMainResponse = repository.requestETH();
            //Ea1.setValue(repository.requestETH().getValue().getResult().XETHZUSD.a.get(0));
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
