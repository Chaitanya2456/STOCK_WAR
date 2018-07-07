package com.example.android.stock_war;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.stock_war.adapter.FeedAdapter;
import com.example.android.stock_war.model.Feed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private FeedAdapter adapter;
    private List<Feed> feedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feedList = new ArrayList<>();
        adapter = new FeedAdapter(this, feedList);

        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        Feed feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                 1, 0, 1, 1, 0);
        feedList.add(0, feed);

        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                0, 0, 0, 0, 1);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 1, 1, 1, 0);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 1, 0, 0, 0);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 0, 1, 0, 0);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 0, 0, 0, 1);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                0, 0, 0, 1, 0);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 0, 1, 1, 1);
        feedList.add(0, feed);
        feed = new Feed("BHEL", "CAT: PHARMACY", "O:15.49", "C:16.44", "L:13.22", "H:18.17", "https://s3.amazonaws.com/zaubatrademarks/11941166-0a1f-4ec0-872d-9e604ec9049c.png",
                1, 1, 1, 0, 0);
        feedList.add(0, feed);
        adapter.notifyDataSetChanged();

    }
}
