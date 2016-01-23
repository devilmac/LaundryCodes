package com.colantoni.federico.projects.tagcodedress.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.colantoni.federico.projects.tagcodedress.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LaundryCodesRVAdapter extends ExpandableRecyclerAdapter<LaundryCodesRVAdapter.GroupViewHolder, LaundryCodesRVAdapter.ChildViewHolder> {

    /**
     * Primary constructor. Sets up {@link #mParentItemList} and {@link #mItemList}.
     * <p>
     * Changes to {@link #mParentItemList} should be made through add/remove methods in
     * {@link ExpandableRecyclerAdapter}
     *
     * @param parentItemList List of all {@link ParentListItem} objects to be
     *                       displayed in the RecyclerView that this
     *                       adapter is linked to
     */
    public LaundryCodesRVAdapter(@NonNull List<? extends ParentListItem> parentItemList) {

        super(parentItemList);
    }

    @Override
    public GroupViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {

        return null;
    }

    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {

        return null;
    }

    @Override
    public void onBindParentViewHolder(GroupViewHolder parentViewHolder, int position, ParentListItem parentListItem) {

    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder childViewHolder, int position, Object childListItem) {

    }

    public static class GroupViewHolder extends ParentViewHolder {

        @Bind(R.id.groupId)
        AppCompatTextView groupTextView;

        /**
         * Default constructor.
         *
         * @param itemView The {@link View} being hosted in this ViewHolder
         */
        public GroupViewHolder(View itemView) {

            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    public static class ChildViewHolder extends com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder {

        @Bind(R.id.childId)
        AppCompatTextView childTextView;

        /**
         * Default constructor.
         *
         * @param itemView The {@link View} being hosted in this ViewHolder
         */
        public ChildViewHolder(View itemView) {

            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}

