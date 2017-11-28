package com.hoge.helloworld;

import android.app.Application;

import com.thinkmobiles.android.sdk.easyqa.EasyQA;

/**
 * Created by hiroyuki.seto on 2017/11/28.
 */

public class HogeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EasyQA.install(this, "project token");
    }
}
