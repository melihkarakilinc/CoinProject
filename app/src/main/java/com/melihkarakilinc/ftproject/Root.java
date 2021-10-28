package com.melihkarakilinc.ftproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root{
    @SerializedName("error")
    @Expose
    public List<String> error;

    @SerializedName("result")
    @Expose
    public Result result;

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
