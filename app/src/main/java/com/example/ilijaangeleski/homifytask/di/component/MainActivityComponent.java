package com.example.ilijaangeleski.homifytask.di.component;

import com.example.ilijaangeleski.homifytask.di.module.MainActivityModule;
import com.example.ilijaangeleski.homifytask.ui.MainActivity;

import dagger.Component;

/**
 * Created by Ilija Angeleski on 12/12/2017.
 */
@Component(modules = MainActivityModule.class, dependencies = BaseComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
