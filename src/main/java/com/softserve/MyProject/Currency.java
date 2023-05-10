package com.softserve.MyProject;

public class Currency {
    private String r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangedate;

    public String getR030() {
        return r030;
    }

    public String getTxt() {
        return txt;
    }

    public double getRate() {
        return rate;
    }

    public String getCc() {
        return cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }
}
