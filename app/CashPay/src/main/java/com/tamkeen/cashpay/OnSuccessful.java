package com.tamkeen.cashpay;




public abstract class OnSuccessful<T> {
    public void onSuccessful(boolean isSuccessful,String pin) {
    }
    public void onSuccessful(boolean isSuccessful) {
    }
    public void onSuccessful(boolean isSuccessful,int a,int b,int d) {
    }
    public void onSuccessful(boolean isSuccessful,int a) {
    }

    public void onSuccessful(boolean isSuccessful,String data,String b) {
    }
    public void onSuccessful(boolean isSuccessful,String data,Long b) {
    }
    public void onSuccessful(boolean isSuccessful,Long b) {
    }



    public void onSuccessful(boolean isSuccessful, T data) {
    }

    public void onSuccessful(int type, T data) {
    }

}