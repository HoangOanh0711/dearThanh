package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ListView listView;
        ArrayList<ListHistory> arrayList;
        AdapterHistory adapterHistory;

        listView = findViewById(R.id.listview_his);

        arrayList = new ArrayList<>();
        arrayList.add(new ListHistory("Delivered", "25/11/2021", "500,000đ - 10 món"));
        arrayList.add(new ListHistory("Delivered", "10/11/2021", "222,000đ - 1 món"));
        arrayList.add(new ListHistory("Delivered", "10/10/2021", "100,000đ - 2 món"));
        arrayList.add(new ListHistory("Delivered", "8/9/2021", "356,000đ - 6 món"));
        arrayList.add(new ListHistory("Delivered", "6/5/2021", "423,000đ - 4 món"));

        adapterHistory = new AdapterHistory(history.this, R.layout.history_row, arrayList);
        listView.setAdapter(adapterHistory);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(history.this, history2.class);
                    startActivity(intent);
                }
            }
        });

        //toolbar
        setSupportActionBar(findViewById(R.id.pro_toolbar));
        getSupportActionBar().setTitle("History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}