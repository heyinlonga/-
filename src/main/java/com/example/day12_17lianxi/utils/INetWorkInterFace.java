package com.example.day12_17lianxi.utils;

public interface INetWorkInterFace {
    public <T> void get(String url , INetCallBack<T> callBack);
}
