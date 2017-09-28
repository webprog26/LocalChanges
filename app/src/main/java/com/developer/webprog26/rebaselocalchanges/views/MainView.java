package com.developer.webprog26.rebaselocalchanges.views;

import android.support.annotation.NonNull;

import com.developer.webprog26.rebaselocalchanges.helpers.TextChanger;

/**
 * Created by webprog on 28.09.17.
 */

public interface MainView {

    @NonNull
    TextChanger provideTextChanger();
}
