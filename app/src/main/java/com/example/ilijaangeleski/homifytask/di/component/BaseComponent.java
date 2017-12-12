package com.example.ilijaangeleski.homifytask.di.component;

import android.content.Context;

import com.example.ilijaangeleski.homifytask.di.module.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface BaseComponent {
    Context getContext();

}