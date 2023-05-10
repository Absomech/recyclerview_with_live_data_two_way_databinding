package com.filter.demo;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.filter.demo.databinding.ItemsRowBinding;

public class ItemsViewHolder extends RecyclerView.ViewHolder {
    ItemsRowBinding binding;
    public ItemsViewHolder(ItemsRowBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

}
