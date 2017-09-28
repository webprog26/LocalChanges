package com.developer.webprog26.rebaselocalchanges.presenters;

import android.support.annotation.NonNull;

import com.developer.webprog26.rebaselocalchanges.helpers.TextChanger;
import com.developer.webprog26.rebaselocalchanges.views.MainView;

/**
 * Created by webprog on 28.09.17.
 */

public interface MainPresenter {

   void setMainView(@NonNull MainView mainView);

   void reactOnButtonClick();

}
