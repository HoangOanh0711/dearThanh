package com.example.doancuoiki;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.myviewholder>{
    ArrayList<products> bread;

    public ListAdapter(ArrayList<products> bread) {
        this.bread = bread;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(bread.get(position).getImage());
        holder.header.setText(bread.get(position).getHeader());
        holder.desc.setText(bread.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return bread.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView header, desc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            header=itemView.findViewById(R.id.t1);
            desc=itemView.findViewById(R.id.t2);
        }
    }
}