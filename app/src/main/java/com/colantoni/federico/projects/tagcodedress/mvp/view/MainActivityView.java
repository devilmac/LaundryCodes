package com.colantoni.federico.projects.tagcodedress.mvp.view;

import com.colantoni.federico.projects.tagcodedress.utils.LaundryCodesGroups;
import com.hannesdorfmann.mosby.mvp.MvpView;

public interface MainActivityView extends MvpView {

    void getLaundryCodesByGroup(LaundryCodesGroups groupId);
}
