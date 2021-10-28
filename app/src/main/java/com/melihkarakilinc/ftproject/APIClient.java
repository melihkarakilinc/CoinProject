package com.melihkarakilinc.ftproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class APIClient {

    //https://api.kraken.com/0/public/Ticker?pair=XBTUSD
    private static Retrofit retrofit = null;
    static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.kraken.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
