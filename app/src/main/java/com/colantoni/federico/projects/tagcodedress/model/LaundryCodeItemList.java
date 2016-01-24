package com.colantoni.federico.projects.tagcodedress.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

public class LaundryCodeItemList implements ParentListItem {

    private List<LaundryCodeItem> laundryCodeItemList;

    public LaundryCodeItemList() {}

    @Override
    public List<LaundryCodeItem> getChildItemList() {

        return laundryCodeItemList;
    }

    @Override
    public boolean isInitiallyExpanded() {

        return false;
    }

    public List<LaundryCodeItem> getLaundryCodeItemList() {return this.laundryCodeItemList;}

    public void setLaundryCodeItemList(List<LaundryCodeItem> laundryCodeItemList) {this.laundryCodeItemList = laundryCodeItemList;}

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof LaundryCodeItemList)) {
            return false;
        }
        final LaundryCodeItemList other = (LaundryCodeItemList) o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$laundryCodeItemList = this.laundryCodeItemList;
        final Object other$laundryCodeItemList = other.laundryCodeItemList;
        return this$laundryCodeItemList == null ? other$laundryCodeItemList == null : this$laundryCodeItemList.equals(other$laundryCodeItemList);
    }

    public int hashCode() {

        final int PRIME = 59;
        int result = 1;
        final Object $laundryCodeItemList = this.laundryCodeItemList;
        result = result * PRIME + ($laundryCodeItemList == null ? 0 : $laundryCodeItemList.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {return other instanceof LaundryCodeItemList;}

    public String toString() {return "com.colantoni.federico.projects.tagcodedress.model.LaundryCodeItemList(laundryCodeItemList=" + this.laundryCodeItemList + ")";}
}
