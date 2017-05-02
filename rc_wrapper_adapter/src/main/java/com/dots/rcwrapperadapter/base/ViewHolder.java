package com.dots.rcwrapperadapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * ViewHolder 基类
 * Created by fengwenhua on 2017/5/2.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private Context context;
    private View itemView;
    private SparseArray<View> childrenViews;

    public ViewHolder(Context context,View itemView) {
        super(itemView);
        this.context = context;
        this.itemView = itemView;
        this.childrenViews = new SparseArray<>();
    }

    public static ViewHolder createViewHolder(Context context,View itemView){
        ViewHolder viewHolder = new ViewHolder(context,itemView);
        return viewHolder;
    }




}
