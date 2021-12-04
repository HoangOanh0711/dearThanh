package com.example.doancuoiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterHistory extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ListHistory> arraylist;

    public AdapterHistory(Context context, int layout, List<ListHistory> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        ListHistory listHistory = arraylist.get(position);

        TextView t1 = convertView.findViewById(R.id.status);
        TextView t2 = convertView.findViewById(R.id.date);
        TextView t3 = convertView.findViewById(R.id.price);

        t1.setText(listHistory.getStatus());
        t2.setText(listHistory.getDate());
        t3.setText(listHistory.getPrice());

        return convertView;


    }
}
