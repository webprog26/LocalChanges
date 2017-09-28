package com.developer.webprog26.rebaselocalchanges.presenters;

import android.support.annotation.NonNull;

import com.developer.webprog26.rebaselocalchanges.helpers.TextChanger;
import com.developer.webprog26.rebaselocalchanges.views.MainView;

/**
 * Created by webprog on 28.09.17.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;

    @Override
    public void setMainView(@NonNull MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void reactOnButtonClick() {

    }
}
