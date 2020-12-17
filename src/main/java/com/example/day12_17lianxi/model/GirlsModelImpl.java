package com.example.day12_17lianxi.model;

import com.example.day12_17lianxi.contract.GirlsContract;
import com.example.day12_17lianxi.utils.INetCallBack;
import com.example.day12_17lianxi.utils.RetrofitUtils;

public class GirlsModelImpl implements GirlsContract.IGirlsModel {
    private GirlsContract.IGirlsPresenter presenter;

    public GirlsModelImpl(GirlsContract.IGirlsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getGirls(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
