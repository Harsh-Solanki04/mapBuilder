package com.example.mapbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StructureAdapter extends RecyclerView.Adapter<StructureAdapter.ViewHolder> {
    List<Structure> structures;
    // Define data source and ViewHolder

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_selection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Bind data to the ViewHolder
    }

    @Override
    public int getItemCount() {
        return structures.size();
        // Return the number of items in the selector
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Define views within each selector item
        public ViewHolder(View itemView) {
            super(itemView);
            // Initialize views
        }
    }

}
