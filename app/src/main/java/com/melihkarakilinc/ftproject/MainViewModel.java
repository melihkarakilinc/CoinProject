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
    MutableLiveData<Root> RxETHMainResponse;
    MutableLiveData<Root> RxBTZMainResponse;

    public LiveData<Root> getRxEth() {
        if (RxETHMainResponse == null) {
            RxETHMainResponse = repository.RXrequestETH();
        }
        return RxETHMainResponse;
    }

    public LiveData<Root> getRxBtz() {
        if (RxBTZMainResponse == null) {
            RxBTZMainResponse = repository.RXrequestBTZ();
        }
        return RxBTZMainResponse;
    }
}
