package com.colantoni.federico.projects.tagcodedress.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

import lombok.Data;

@Data
public class LaundryCodeItemList implements ParentListItem {

    private List<LaundryCodeItem> laundryCodeItemList;

    @Override
    public List<LaundryCodeItem> getChildItemList() {

        return laundryCodeItemList;
    }

    @Override
    public boolean isInitiallyExpanded() {

        return false;
    }
}
