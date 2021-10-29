package com.melihkarakilinc.ftproject;

import android.annotation.SuppressLint;

import androidx.lifecycle.MutableLiveData;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainRespository {

    IApi iApi;

    public MainRespository() {
        iApi = APIClient.getClient().create(IApi.class);
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<Root> RXrequestETHFive() {
        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        Scheduler scheduler = Schedulers.from(Executors.newSingleThreadExecutor());
        Observable.interval(5, TimeUnit.SECONDS)
                .flatMap(n ->
                        iApi.getDataETH()
                                .retry(3)
                                .subscribeOn(scheduler))
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Root>() {
            @Override
            public void accept(Root root) throws Exception {
                mutableLiveData.setValue(root);
            }
        });
        return mutableLiveData;
    }

    @SuppressLint("CheckResult")
    public MutableLiveData<Root> RXrequestBTZFive() {
        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        Scheduler scheduler = Schedulers.from(Executors.newSingleThreadExecutor());
        Observable.interval(5, TimeUnit.SECONDS)
                .flatMap(n ->
                        iApi.getDataBTC()
                                .retry(3)
                                .subscribeOn(scheduler))
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Root>() {
            @Override
            public void accept(Root root) throws Exception {
                mutableLiveData.setValue(root);
            }
        });
        return mutableLiveData;
    }


}
