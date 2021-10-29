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
    public LiveData<Long> setColor(Long oldValue, Long newValue) {

        int color =(R.color.black);

        if (oldValue > newValue) {
            color=R.color.red;
        } else if (oldValue < newValue) {
            color=(R.color.green);
        } else {
            color=(R.color.black);
        }
        MutableLiveData<Long> color2 = new MutableLiveData<>();
        color2.postValue(Long.parseLong(String.valueOf(color)));
        return color2;
    }
}
