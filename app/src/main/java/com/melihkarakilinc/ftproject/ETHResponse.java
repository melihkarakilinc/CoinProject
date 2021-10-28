package com.melihkarakilinc.ftproject;

import androidx.lifecycle.MutableLiveData;

public class ETHResponse {

    private static ETHResponse ethResponse;

    public static ETHResponse getInstance(){
        if (ethResponse == null){
            ethResponse = new ETHResponse();
        }
        return ethResponse;
    }
    private IApi iApi;

    public void ETHRepository(){
        IApi api = APIClient.getClient().create(IApi.class);
    }

}
