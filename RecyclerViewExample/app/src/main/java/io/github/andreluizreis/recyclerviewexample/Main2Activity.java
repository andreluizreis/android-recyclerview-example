package io.github.andreluizreis.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // LayoutManager will be a Linear Layout
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Example Array
        String[] myDataset = {"Example 1", "Example 2", "Example 3", "Example 4",
                "Example 5", "Example 6", "Example 7", "Example 8"};

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter2(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
