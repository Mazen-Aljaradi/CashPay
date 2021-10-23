package com.tamkeen.cashpay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import static com.tamkeen.cashpay.CashPayBuilder.CASHPAY_REQUEST_CODE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CashPay.init(this)
                .setShortcode("1564")
                .setAmount(54.5)
                .setEdNote("note")
                .build();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case CASHPAY_REQUEST_CODE:
                if (resultCode == -1)

                    CashPay.Scan(data,this);


                break;
            // value passed in AutoResolveHelper

        }
    }


}