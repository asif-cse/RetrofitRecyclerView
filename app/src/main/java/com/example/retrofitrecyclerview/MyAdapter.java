package com.example.retrofitrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ItemData> itemData;
    public MyAdapter(Context context, ArrayList<ItemData> itemData) {
        this.context=context;
        this.itemData=itemData;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
        return new MyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.tv1.setText("ID: "+itemData.get(position).getId());
        holder.tv2.setText(itemData.get(position).getName());
        holder.tv3.setText(itemData.get(position).getResource());
        holder.tv4.setText(itemData.get(position).getUpdate_at());
    }

    @Override
    public int getItemCount() {
        return itemData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView  tv1,tv2, tv3, tv4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_idId);
            tv2 = itemView.findViewById(R.id.tv_nameId);
            tv3 = itemView.findViewById(R.id.tv_resourceId);
            tv4 = itemView.findViewById(R.id.tv_updateId);
        }
    }
}
