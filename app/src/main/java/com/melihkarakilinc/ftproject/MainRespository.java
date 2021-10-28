package com.melihkarakilinc.ftproject;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

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

}
