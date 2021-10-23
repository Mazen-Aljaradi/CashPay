package com.tamkeen.cashpay;

import android.app.Activity;
import android.content.Context;

public class CashPayBuilder {

    public static final int CASHPAY_REQUEST_CODE = 15;
    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private Activity activity;
    private String shortcode;
    private double amount;

    public String getEdNote() {
        return edNote;
    }

    public CashPayBuilder setEdNote(String edNote) {
        this.edNote = edNote;
        return this;
    }

    private String edNote;


    public CashPayBuilder(Activity activity) {

        this.activity = (Activity) activity.getApplicationContext();
    }



    public String getShortcode() {
        return shortcode;
    }

    public CashPayBuilder setShortcode(String shortcode) {
        this.shortcode = shortcode;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public CashPayBuilder setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public void build() {
        CashPay.build(this);
    }
}
