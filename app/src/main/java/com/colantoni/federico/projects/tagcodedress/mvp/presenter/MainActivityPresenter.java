package com.colantoni.federico.projects.tagcodedress.mvp.presenter;

import com.colantoni.federico.projects.tagcodedress.mvp.view.MainActivityView;
import com.colantoni.federico.projects.tagcodedress.utils.LaundryCodesGroups;
import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;

public class MainActivityPresenter extends MvpNullObjectBasePresenter<MainActivityView> {

    public void getLaundryCodesByGroup(LaundryCodesGroups groupId) {

        //TODO get in some way the list of laundry codes grouped by specified groupId

        getView().getLaundryCodesByGroup(groupId);
    }
}
