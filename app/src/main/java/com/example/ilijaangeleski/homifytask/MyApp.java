package com.example.ilijaangeleski.homifytask;

import android.app.Application;

import com.example.ilijaangeleski.homifytask.di.component.BaseComponent;
import com.example.ilijaangeleski.homifytask.di.component.DaggerBaseComponent;
import com.example.ilijaangeleski.homifytask.di.module.AppModule;

public class MyApp extends Application {
    private BaseComponent baseComponent;
    private static MyApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        baseComponent = DaggerBaseComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static MyApp getApp() {
        return app;
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}