package com.qq.zjdemo;

import android.app.Application;
import android.content.Context;

import com.tencent.android.otherPush.StubAppUtils;


/**
 * Created by admin on 2017/2/13.
 */

public class app extends Application {
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        StubAppUtils.attachBaseContext(base);


    }
}



