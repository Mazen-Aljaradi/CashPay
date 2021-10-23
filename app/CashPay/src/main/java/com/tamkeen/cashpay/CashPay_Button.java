package com.tamkeen.cashpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


@SuppressLint("AppCompatCustomView")
public class CashPay_Button extends Button {
    public CashPay_Button(final Context context) {
        super(context);
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                context.startActivity(intent);

            }
        });

    }


    public  void  Runner(Activity activity){

    }



}
