package com.example.testxwebview;

import android.app.Application;

import com.tencent.smtt.sdk.QbSdk;

/**
 * @author Alen
 **/
public class App  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(getApplicationContext(), null);

    }
}
