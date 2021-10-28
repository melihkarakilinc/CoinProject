package com.melihkarakilinc.ftproject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {

    @GET("0/public/Ticker?interval=1&pair=BTCUSD")
    Call<Root> GetDataBTCUSD();

    @GET("0/public/Ticker?interval=1&pair=ETHUSD")
    Call<Root> GetDataETHUSD();
}
