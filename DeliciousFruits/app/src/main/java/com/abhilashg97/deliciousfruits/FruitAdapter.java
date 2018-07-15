package com.abhilashg97.deliciousfruits;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    private ArrayList<Fruit> fruits;

    public FruitAdapter(ArrayList<Fruit> fruits){
        this.fruits = fruits;
    }

    class FruitViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_fruitName)
        TextView fruitName;

        @BindView(R.id.iv_fruitImage)
        ImageView imageView;

        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new FruitViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fruit_item_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder fruitViewHolder, int position) {
        fruitViewHolder.fruitName.setText(fruits.get(position).getFruitName());
        fruitViewHolder.imageView.setImageResource(fruits.get(position).getImageID());
    }


    @Override
    public int getItemCount() {
        return fruits.size();
    }
}
