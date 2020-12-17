package com.example.day12_17lianxi.contract;

import com.example.day12_17lianxi.bean.GirlsBean;
import com.example.day12_17lianxi.utils.INetCallBack;

public class GirlsContract {
    public interface IGirlsModel{
        <T> void getGirls(String url, INetCallBack<T> callBack);
    }
    public interface IGirlsPresenter{
        void getGirls();
    }
    public interface IGirlsView{
        void getGirls(GirlsBean girlsBean);
        void onFail(String error);
    }
}
