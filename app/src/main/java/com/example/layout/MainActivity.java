package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView grvItems;
    private ListView lvItems;
    private CustomItemsAdapter adt;
    private ArrayList<Items> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grvItems = findViewById(R.id.grvItems);
//        lvItems = findViewById(R.id.lvItems);
        arrayList = new ArrayList<>();
        arrayList.add(new Items("Google", "80$", R.drawable.google));
        arrayList.add(new Items("Google", "80$", R.drawable.google));
        arrayList.add(new Items("Google", "80$", R.drawable.google));
        arrayList.add(new Items("Google", "80$", R.drawable.google));
        arrayList.add(new Items("Google", "80$", R.drawable.google));
        arrayList.add(new Items("Google", "80$", R.drawable.google));

        Items[] items = new Items[] {
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google),
                new Items("Google", "80$", R.drawable.google)
        };

        adt = new CustomItemsAdapter(this, R.layout.items_layout, arrayList);
        grvItems.setAdapter(adt);
    }
}