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
    MutableLiveData<Root> RxETHMainResponse;
    MutableLiveData<Root> RxBTZMainResponse;

    public LiveData<Root> getRxEth() {
        if (RxETHMainResponse == null) {
            RxETHMainResponse = repository.RXrequestETHFive();
        }
        return RxETHMainResponse;
    }

    public LiveData<Root> getRxBtz() {
        if (RxBTZMainResponse == null) {
            RxBTZMainResponse = repository.RXrequestBTZFive();
        }
        return RxBTZMainResponse;
    }
}
