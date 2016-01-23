package com.colantoni.federico.projects.tagcodedress.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colantoni.federico.projects.tagcodedress.R;
import com.colantoni.federico.projects.tagcodedress.mvp.presenter.MainFragmentPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainFragment extends BaseFragment {

    @Bind(R.id.laundryCodeRV)
    RecyclerView laundryCodesRV;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(view);

        return view;
    }

    @NonNull
    @Override
    public MainFragmentPresenter createPresenter() {

        return new MainFragmentPresenter();
    }
}
