package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alquran.allahname.Adapter;
import com.example.alquran.allahname.ModelClass;

import java.util.ArrayList;
import java.util.List;

public class AllahnameActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userlist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allahname);

        initData();
        initRecyclerView();
    }

    private void initData() {

        userlist = new ArrayList<>();
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));
        userlist.add(new ModelClass("Allah","আল্লাহু"));

    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}