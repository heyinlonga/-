package com.example.day12_17lianxi.presenter;

import com.example.day12_17lianxi.base.BasePresenter;
import com.example.day12_17lianxi.bean.GirlsBean;
import com.example.day12_17lianxi.contract.GirlsContract;
import com.example.day12_17lianxi.model.GirlsModelImpl;
import com.example.day12_17lianxi.utils.INetCallBack;

public class GirlsPresenterImpl extends BasePresenter implements GirlsContract.IGirlsPresenter {
    private final GirlsModelImpl model;
    private GirlsContract.IGirlsView girlsView;

    public GirlsPresenterImpl(GirlsContract.IGirlsView girlsView) {
        this.girlsView = girlsView;
        model = new GirlsModelImpl(this);
    }

    @Override
    public void getGirls() {
        model.getGirls("type/Girl/page/5/count/5", new INetCallBack<GirlsBean>() {
            @Override
            public void onSuccess(GirlsBean girlsBean) {
                girlsView.getGirls(girlsBean);
            }

            @Override
            public void onFail(String error) {
                girlsView.onFail(error);
            }
        });
    }
}
