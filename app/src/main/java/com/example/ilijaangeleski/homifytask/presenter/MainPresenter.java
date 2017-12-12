package com.example.ilijaangeleski.homifytask.presenter;

import com.example.ilijaangeleski.homifytask.R;
import com.example.ilijaangeleski.homifytask.model.Item;
import com.example.ilijaangeleski.homifytask.view.MainView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilija Angeleski on 12/12/2017.
 */

public class MainPresenter {

    private WeakReference<MainView> mainViewWeakReference;
    List<Item> items = new ArrayList<>();

    public MainPresenter(
            WeakReference<MainView> mainViewWeakReference
    ) {
        this.mainViewWeakReference = mainViewWeakReference;
        generateItems();
    }

    private void generateItems() {
        items.add(new Item(R.drawable.item1, "item 1"));
        items.add(new Item(R.drawable.item2, "item 2"));
        items.add(new Item(R.drawable.item3, "item 3"));
        items.add(new Item(R.drawable.item4, "item 4"));
        items.add(new Item(R.drawable.item5, "item 5"));
        items.add(new Item(R.drawable.item6, "item 6"));
        items.add(new Item(R.drawable.item7, "item 7"));
        items.add(new Item(R.drawable.item8, "item 8"));
        items.add(new Item(R.drawable.item9, "item 9"));
        items.add(new Item(R.drawable.item10, "item 10"));
        items.add(new Item(R.drawable.item11, "item 11"));
        items.add(new Item(R.drawable.item12, "item 12"));
        items.add(new Item(R.drawable.item13, "item 13"));
        items.add(new Item(R.drawable.item14, "item 14"));
    }

    public List<Item> getItems() {
        return items;
    }

}
