package com.abhilashg97.deliciousfruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_fruits_list)
    RecyclerView fruitRecyclerView;

    private RecyclerView.Adapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fruitAdapter = new FruitAdapter(createFruits());

        fruitRecyclerView.setAdapter(fruitAdapter);
    }

    public ArrayList<Fruit> createFruits() {

        ArrayList<Fruit> fruitNames = new ArrayList<>();
        fruitNames.add(new Fruit("apple",R.drawable.apple ));
        fruitNames.add(new Fruit("avocado", R.drawable.avocado));
        fruitNames.add(new Fruit("banana", R.drawable.banana));
        fruitNames.add(new Fruit("watermelon",R.drawable.watermelon));
        fruitNames.add(new Fruit("cherries", R.drawable.cherries));
        fruitNames.add(new Fruit("orange", R.drawable.orange));
        fruitNames.add(new Fruit("peach", R.drawable.peach));

        return fruitNames;
    }

}
