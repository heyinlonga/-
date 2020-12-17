package com.example.day12_17lianxi.utils;

public interface INetCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String error);
}
