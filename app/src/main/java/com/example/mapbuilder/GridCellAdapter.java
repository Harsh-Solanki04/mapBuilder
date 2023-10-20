package com.example.mapbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GridCellAdapter extends RecyclerView.Adapter<GridCellAdapter.ViewHolder> {
    List<Structure> structures;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Bind data to the ViewHolder
    }

    @Override
    public int getItemCount() {
        // Return the number of grid cells
        return structures.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        // Define views within the grid cell
        public ViewHolder(View itemView) {
            super(itemView);
            // Initialize views
        }
    }
}


