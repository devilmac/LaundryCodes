package com.colantoni.federico.projects.tagcodedress.fragment;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

public class BaseFragment<V extends MvpView, P extends MvpPresenter<V>> extends MvpFragment<V, P> {

    @Override
    @NonNull
    public P createPresenter() {

        return null;
    }
}
