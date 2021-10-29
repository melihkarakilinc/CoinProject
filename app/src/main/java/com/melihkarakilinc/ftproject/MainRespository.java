package com.melihkarakilinc.ftproject;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRespository {

    IApi iApi;

    public MainRespository() {
        iApi = APIClient.getClient().create(IApi.class);
    }

    public MutableLiveData<Root> requestETH() {

        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        Call<Root> call = iApi.GetDataETHUSD();

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(@NonNull Call<Root> call, @NotNull Response<Root> response) {
                if (response.isSuccessful()) {
                    Root RootResponse = response.body();
                    mutableLiveData.setValue(RootResponse);
                }
            }
            @Override
            public void onFailure(@NotNull Call<Root> call, @NotNull Throwable t) {
                Log.e("ETHResponse", "onFailure: " + t.getMessage());
            }
        });
        return mutableLiveData;
    }

    public MutableLiveData<Root> requestBTZ() {

        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        Call<Root> call = iApi.GetDataBTCUSD();

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(@NonNull Call<Root> call, @NotNull Response<Root> response) {
                if (response.isSuccessful()) {
                    Root RootResponse = response.body();
                    mutableLiveData.setValue(RootResponse);
                }
            }

            @Override
            public void onFailure(@NotNull Call<Root> call, @NotNull Throwable t) {
                Log.e("ETHResponse", "onFailure: " + t.getMessage());
            }
        });
        return mutableLiveData;
    }

    public MutableLiveData<Root> RXrequestETH() {
        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(iApi.getDataETH()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Consumer<Root>() {
            @Override
            public void accept(Root root) throws Exception {
                mutableLiveData.setValue(root);
            }
        }));
        return mutableLiveData;
    }

    public MutableLiveData<Root> RXrequestBTZ() {
        MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();

        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(iApi.getDataBTC()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Root>() {
                    @Override
                    public void accept(Root root) throws Exception {
                        mutableLiveData.setValue(root);
                    }
                }));
        return mutableLiveData;
    }


}
