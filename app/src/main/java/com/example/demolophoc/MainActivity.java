package com.example.demolophoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods(R.drawable.code));
        arrayList.add(new Goods(R.drawable.code));
        arrayList.add(new Goods(R.drawable.code));
        arrayList.add(new Goods(R.drawable.code));
        arrayList.add(new Goods(R.drawable.code));

        adt = new CustomGoodsAdapter(this, R.layout.item_resourse_listview, arrayList);
        lvGoods.setAdapter(adt);
    }
}