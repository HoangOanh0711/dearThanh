package com.example.doancuoiki;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class f_bread extends Fragment {

    View view;
    ArrayList<products> bread;

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_f_bread, container, false);

        RecyclerView recyclerView =view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        bread=new ArrayList<>();

        products b1=new products(R.drawable.banh1, "Bánh sandwich lạt 400g", "19,800đ");
        bread.add(b1);

        products b2=new products(R.drawable.banh2, "Bánh Mì Bơ Nho Khô Túi 10 Cái*35G", "25,000đ");
        bread.add(b2);

        products b3=new products(R.drawable.banh3, "Set Bánh Croissant Phủ Sốt Bơ Tỏi", "30,000đ");
        bread.add(b3);

        products b4=new products(R.drawable.banh4, "Set Bánh Croissant Phủ Sốt Bơ Tỏi", "20,000đ");
        bread.add(b4);

        products b5=new products(R.drawable.banh5, "Gói 10 Bánh Mì Bơ", "20,000đ");
        bread.add(b5);

        products b6=new products(R.drawable.banh1, "Bánh Mì Yến Mạch", "19,800đ");
        bread.add(b6);

        products b7=new products(R.drawable.banh2, "banh7", "70k");
        bread.add(b7);

        products b8=new products(R.drawable.banh3, "banh8", "80k");
        bread.add(b8);

        products b9=new products(R.drawable.banh4, "banh9", "90k");
        bread.add(b9);

        recyclerView.setAdapter(new ListAdapter(bread));

        return view;
    }

}