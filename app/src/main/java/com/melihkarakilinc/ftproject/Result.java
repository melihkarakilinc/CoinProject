package com.melihkarakilinc.ftproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("XXBTZUSD")
    @Expose
    public XXBTZUSD XXBTZUSD;

    public XXBTZUSD getXXBTZUSD() {
        return XXBTZUSD;
    }

    public void setXXBTZUSD(XXBTZUSD XXBTZUSD) {
        this.XXBTZUSD = XXBTZUSD;
    }

    @SerializedName("XETHZUSD")
    @Expose
    public XETHZUSD XETHZUSD;

    public XETHZUSD getXETHZUSD() {
        return XETHZUSD;
    }

    public void setXETHZUSD(XETHZUSD XETHZUSD) {
        this.XETHZUSD = XETHZUSD;
    }
}

