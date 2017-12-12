package com.example.ilijaangeleski.homifytask.di.module;

import com.example.ilijaangeleski.homifytask.presenter.MainPresenter;
import com.example.ilijaangeleski.homifytask.view.MainView;

import java.lang.ref.WeakReference;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ilija Angeleski on 12/12/2017.
 */
@Module
public class MainActivityModule {
    WeakReference<MainView> view;

    public MainActivityModule(MainView view) {
        this.view = new WeakReference<>(view);
    }

    @Provides
    MainPresenter provideMainPresenter() {
        return new MainPresenter(view);
    }
}
