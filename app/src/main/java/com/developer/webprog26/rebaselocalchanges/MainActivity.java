package com.developer.webprog26.rebaselocalchanges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developer.webprog26.rebaselocalchanges.presenters.MainPresenter;
import com.developer.webprog26.rebaselocalchanges.presenters.MainPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.btn_click)
    Button mBtnClick;

    private MainPresenter mainPresenter = new MainPresenterImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getBtnClick().setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_click:
                getMainPresenter().reactOnButtonClick();
                break;
        }
    }

    private Button getBtnClick() {
        return mBtnClick;
    }

    private MainPresenter getMainPresenter() {
        return mainPresenter;
    }
}
