package com.dots.rcwrapperadapter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.dots.rcwrapperadapter.base.ViewHolder;
import com.dots.rcwrapperadapter.utils.SmallUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单
 * Created by fengwenhua on 2017/5/2.
 */

public class CommonAdapter<T> extends RecyclerView.Adapter<ViewHolder> {

    private List<T> mRecycleViewDatas;
    /**头部*/
    private List<View> mHeadViews = new ArrayList<>();
    /**尾部*/
    private List<View> mFootViews = new ArrayList<>();

    private RecyclerView.Adapter<ViewHolder> innerAdapter;

    public CommonAdapter(RecyclerView.Adapter<ViewHolder> innerAdapter){
        this.innerAdapter = innerAdapter;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (SmallUtils.isEmpty(mRecycleViewDatas)) {
            return 0;
        }
        return mRecycleViewDatas.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public void addHeadViews(View view){
        mHeadViews.add(view);
    }

}
