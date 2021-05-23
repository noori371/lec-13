package com.snovia.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<friends> friendsList = new ArrayList<friends>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter();

    }
    private void setListAdapter() {

        friends f0 = new friends(1,"Ali", 1980, "Giglgit");
        friends f1 = new friends(2,"Babar", 1981, "Lahore");
        friends f2 = new friends(3,"Musa", 1980, "Quetta");
        friends f3 = new friends(4,"Abid",1987,"Peshawar");
        friends f4 = new friends(5,"Shahid", 1980, "Karachi");
        friends f5 = new friends(6,"Zia",1987,"Faisalabad ");
        friends f6 = new friends(7,"Badar", 1980, "Rawalpindi");

        int[] images= {R.drawable.ic_person1,R.drawable.ic_person2,R.drawable.ic_person3,
        R.drawable.ic_person4, R.drawable.ic_person5, R.drawable.ic_person6, R.drawable.ic_person7};

        friendsList.addAll(Arrays.asList(new friends[]{f0,f1,f2,f3,f4,f5,f6}));
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this,images) {

        };

        recyclerView.setAdapter(adapter);
    }
}