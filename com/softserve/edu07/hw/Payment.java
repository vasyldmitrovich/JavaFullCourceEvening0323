package com.softserve.edu07.hw;

public interface Payment {
    public default int calculatePay(){
        return 0;
    }
}
