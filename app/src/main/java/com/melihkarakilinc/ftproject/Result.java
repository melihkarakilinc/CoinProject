package com.melihkarakilinc.ftproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("XXBTZUSD")
    @Expose
    public XXBTZUSD xXBTZUSD;

    public XXBTZUSD getxXBTZUSD() {
        return xXBTZUSD;
    }

    public void setxXBTZUSD(XXBTZUSD xXBTZUSD) {
        this.xXBTZUSD = xXBTZUSD;
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

