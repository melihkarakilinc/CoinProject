package com.melihkarakilinc.ftproject;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("XXBTZUSD")
    @Expose
    @NonNull
    public XXBTZUSD XXBTZUSD;

    @SerializedName("XETHZUSD")
    @Expose
    @NonNull
    public XETHZUSD XETHZUSD;

    public Result(@NonNull com.melihkarakilinc.ftproject.XXBTZUSD XXBTZUSD,
                  @NonNull com.melihkarakilinc.ftproject.XETHZUSD XETHZUSD) {
        this.XXBTZUSD = XXBTZUSD;
        this.XETHZUSD = XETHZUSD;
    }
    public Result(){

    }

    public XXBTZUSD getXXBTZUSD() {
        return XXBTZUSD;
    }

    public void setXXBTZUSD(XXBTZUSD XXBTZUSD) {
        this.XXBTZUSD = XXBTZUSD;
    }


    public XETHZUSD getXETHZUSD() {
        return XETHZUSD;
    }

    public void setXETHZUSD(XETHZUSD XETHZUSD) {
        this.XETHZUSD = XETHZUSD;
    }
}

