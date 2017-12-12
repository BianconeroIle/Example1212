package com.example.ilijaangeleski.homifytask.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.ilijaangeleski.homifytask.MyApp;
import com.example.ilijaangeleski.homifytask.R;
import com.example.ilijaangeleski.homifytask.adapter.RecyclerViewAdapter;
import com.example.ilijaangeleski.homifytask.di.component.DaggerMainActivityComponent;
import com.example.ilijaangeleski.homifytask.di.module.MainActivityModule;
import com.example.ilijaangeleski.homifytask.presenter.MainPresenter;
import com.example.ilijaangeleski.homifytask.view.MainView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    RecyclerViewAdapter adapter;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        createDependencies();
        initVariables();
    }

    public void initVariables() {
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        adapter = new RecyclerViewAdapter(presenter.getItems());
        recyclerView.setAdapter(adapter);
    }

    private void createDependencies() {
        DaggerMainActivityComponent
                .builder()
                .mainActivityModule(new MainActivityModule(this))
                .baseComponent(MyApp.getApp().getBaseComponent())
                .build()
                .inject(this);
    }
}
