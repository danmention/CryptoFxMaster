package com.example.android.cryptofx;

/**
 * Created by Daniel on 11/5/2017.
 */

public class Items {
    private String currency;
    private double btc_value, eth_value;

    public Items(String currency, double btc_value, double eth_value) {
        this.currency = currency;
        this.btc_value = btc_value;
        this.eth_value = eth_value;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBtc_value() {
        return btc_value;
    }

    public double getEth_value() {
        return eth_value;
    }
}
