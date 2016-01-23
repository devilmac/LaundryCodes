package com.colantoni.federico.projects.tagcodedress.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import com.colantoni.federico.projects.tagcodedress.R;
import com.colantoni.federico.projects.tagcodedress.fragment.MainFragment;
import com.colantoni.federico.projects.tagcodedress.mvp.presenter.MainActivityPresenter;
import com.colantoni.federico.projects.tagcodedress.mvp.view.MainActivityView;
import com.colantoni.federico.projects.tagcodedress.utils.LaundryCodesGroups;

public class MainActivity extends BaseActivity<MainActivityView, MainActivityPresenter> implements MainActivityView {

    private Toolbar toolbar;

    private MainFragment mainFragment;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initInstances();

        setupMainFragment();
    }

    private void initInstances() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getSupportFragmentManager();
    }

    private void setupMainFragment() {

        if (fragmentManager.findFragmentByTag(MainFragment.class.getSimpleName()) == null) {

            mainFragment = new MainFragment();
            fragmentManager.beginTransaction().replace(R.id.rootLayout, mainFragment, MainFragment.class.getSimpleName()).commit();
        }
        else {

            mainFragment = (MainFragment) fragmentManager.findFragmentByTag(MainFragment.class.getSimpleName());
        }
    }

    @NonNull
    @Override
    public MainActivityPresenter createPresenter() {

        return new MainActivityPresenter();
    }

    @Override
    public void getLaundryCodesByGroup(LaundryCodesGroups groupId) {

        switch (groupId) {

            case MACHINE_WASH:

                break;

            case TUMBLE_DRY:

                break;

            case DRYING:

                break;

            case IRONING:

                break;

            case BLEACHING:

                break;

            case DRY_CLEAN:

                break;

            default:
        }
    }
}
