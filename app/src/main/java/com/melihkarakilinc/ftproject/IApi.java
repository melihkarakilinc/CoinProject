package com.melihkarakilinc.ftproject;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {

    @GET("0/public/Ticker?interval=1&pair=BTCUSD")
    Call<Root> GetDataBTCUSD();

    @GET("0/public/Ticker?interval=1&pair=ETHUSD")
    Call<Root> GetDataETHUSD();

    @GET("0/public/Ticker?interval=1&pair=ETHUSD")
    Observable<Root> getDataETH();

    @GET("0/public/Ticker?interval=1&pair=BTCUSD")
    Observable<Root> getDataBTC();
}
