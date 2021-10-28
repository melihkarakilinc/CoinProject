package com.melihkarakilinc.ftproject;


import androidx.lifecycle.ViewModel;

import retrofit2.Call;

public class MainViewModel extends ViewModel {


    IApi api = APIClient.getClient().create(IApi.class);
    Call<Root> call = api.GetDataETHUSD();


}
