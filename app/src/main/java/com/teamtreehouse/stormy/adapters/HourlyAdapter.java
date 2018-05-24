package com.teamtreehouse.stormy.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.teamtreehouse.stormy.databinding.HourlyListItemBinding;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder> {
  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    // Binding Variables
    public HourlyListItemBinding hourlyListItemBinding;

    // Create a constructor to do view lookups for each subview
    public ViewHolder(HourlyListItemBinding hourlylayoutBinding) {
      super(hourlylayoutBinding.getRoot());
      hourlyListItemBinding = hourlylayoutBinding;
    }
  }
}
