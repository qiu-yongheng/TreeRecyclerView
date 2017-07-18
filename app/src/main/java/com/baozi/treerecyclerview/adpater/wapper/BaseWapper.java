package com.baozi.treerecyclerview.adpater.wapper;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.baozi.treerecyclerview.adpater.ItemManager;
import com.baozi.treerecyclerview.base.BaseRecyclerAdapter;
import com.baozi.treerecyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by baozi on 2017/5/16.
 */

public class BaseWapper<T> extends BaseRecyclerAdapter<T> {

    protected BaseRecyclerAdapter<T> mAdapter;

    public BaseWapper(BaseRecyclerAdapter<T> adapter) {
        mAdapter = adapter;
        mAdapter.getItemManager().setAdapter(this);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        mAdapter.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onViewAttachedToWindow(ViewHolder holder) {
        mAdapter.onViewAttachedToWindow(holder);
    }

    @Override
    public int getItemViewType(int position) {
        return mAdapter.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        mAdapter.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return mAdapter.getItemCount();
    }

    @Override
    public int getLayoutId(int position) {
        return mAdapter.getLayoutId(position);
    }

    @Override
    public T getData(int position) {
        return mAdapter.getData(position);
    }

    @Override
    public List<T> getDatas() {
        return mAdapter.getDatas();
    }

    @Override
    public void setDatas(List<T> datas) {
        mAdapter.setDatas(datas);
    }

    @Override
    public void onBind(ViewHolder holder, T t, int position) {
        mAdapter.onBind(holder, t, position);
    }

    @Override
    public CheckItem getCheckItem() {
        return mAdapter.getCheckItem();
    }

    @Override
    public void setCheckItem(CheckItem checkItem) {
        mAdapter.setCheckItem(checkItem);
    }

    @Override
    public void setOnItemClickListener(OnItemClickLitener onItemClickListener) {
        mAdapter.setOnItemClickListener(onItemClickListener);
    }

    @Override
    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        mAdapter.setOnItemLongClickListener(onItemLongClickListener);
    }

    @Override
    public ItemManager<T> getItemManager() {
        return mAdapter.getItemManager();
    }

    @Override
    public void setItemManager(ItemManager<T> itemManager) {
        mAdapter.setItemManager(itemManager);
    }
}
