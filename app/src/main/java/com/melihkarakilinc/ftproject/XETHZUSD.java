package com.melihkarakilinc.ftproject;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class XETHZUSD {
    @SerializedName("a")
    @Expose
    public List<String> a;

    @SerializedName("b")
    @Expose
    public List<String> b;

    @SerializedName("c")
    @Expose
    public List<String> c;

    @SerializedName("v")
    @Expose
    public List<String> v;

    @SerializedName("p")
    @Expose
    public List<String> p;

    @SerializedName("t")
    @Expose
    public List<Integer> t;

    @SerializedName("l")
    @Expose
    public List<String> l;

    @SerializedName("h")
    @Expose
    public List<String> h;

    @SerializedName("o")
    @Expose
    public String o;

    public XETHZUSD(List<String> a,
                    List<String> b,
                    List<String> c,
                    List<String> v,
                    List<String> p,
                    List<Integer> t,
                    List<String> l,
                    List<String> h,
                    String o) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.v = v;
        this.p = p;
        this.t = t;
        this.l = l;
        this.h = h;
        this.o = o;
    }

    public XETHZUSD() {

    }

    public List<String> getA() {
        return a;
    }

    public void setA(List<String> a) {
        this.a = a;
    }

    public List<String> getB() {
        return b;
    }

    public void setB(List<String> b) {
        this.b = b;
    }

    public List<String> getC() {
        return c;
    }

    public void setC(List<String> c) {
        this.c = c;
    }

    public List<String> getV() {
        return v;
    }

    public void setV(List<String> v) {
        this.v = v;
    }

    public List<String> getP() {
        return p;
    }

    public void setP(List<String> p) {
        this.p = p;
    }

    public List<Integer> getT() {
        return t;
    }

    public void setT(List<Integer> t) {
        this.t = t;
    }

    public List<String> getL() {
        return l;
    }

    public void setL(List<String> l) {
        this.l = l;
    }

    public List<String> getH() {
        return h;
    }

    public void setH(List<String> h) {
        this.h = h;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

}

