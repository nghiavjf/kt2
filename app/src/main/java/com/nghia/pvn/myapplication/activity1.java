package com.nghia.pvn.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class activity1 extends Fragment {
    private View view;
    public ListView listview;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_1,container,false);
        final ArrayList<product> arrayList = new ArrayList<>();
        listview = view.findViewById(R.id.listview);
        arrayList.add(new product("VinMart","inMart",R.drawable.hh));
        arrayList.add(new product("Meiji","Meiji",R.drawable.hh2));
        arrayList.add(new product("Bác Tôm","Bác Tôm",R.drawable.hh3));
        arrayList.add(new product("F5 Fruit","F5 Fruit",R.drawable.hh4));
        arrayList.add(new product("Nông Sản Dủng Hà","Nông Sản Dủng Hà",R.drawable.hh5));
        arrayList.add(new product("Thực Phảm Quốc Huy","Thực Phảm Quốc Huy",R.drawable.hh));
        final adapter adapter = new adapter(getActivity(), R.layout.list, arrayList);
        listview.setAdapter(adapter);

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                arrayList.remove(position);
                Toast.makeText(getActivity(), "ĐÃ XÓA", Toast.LENGTH_LONG).show();
                adapter.notifyDataSetChanged();

                return false;
            }
        });
        return view;
    }


}
