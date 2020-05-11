package com.moskaoud.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter adapter;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_main);
        ArrayList<Cat> cats = new ArrayList<>();
        for(int e=0;e<100;e++)
        {
            cats.add(new Cat(R.drawable.ic_launcher_background,"Car "+e));
        }

        adapter = new RecyclerViewAdapter(cats );

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

    }
}
