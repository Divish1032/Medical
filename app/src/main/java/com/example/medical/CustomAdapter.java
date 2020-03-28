package com.example.medical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class customAdapter extends RecyclerView.Adapter<customAdapter.MyViewHolder> {
    Context context;
    ArrayList<String> list;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }
    public customAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowlayout18, viewGroup, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(list.get(i));
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}