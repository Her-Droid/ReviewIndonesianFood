package com.dicoding.subDicoding;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewFoodAdapter extends RecyclerView.Adapter<CardViewFoodAdapter.CardViewViewHolder>{
    public CardViewFoodAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }

    private ArrayList<Food> listFood;

    public CardViewFoodAdapter(ArrayList<Food> list) { this.listFood = list;}


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_food, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewFoodAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        final Food p = getListFood().get(i);

        Glide.with(context)
                .load(p.getImage())
                .placeholder(R.drawable.bakso)
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgImage);

        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvDetail.setText(p.getDetail());


        cardViewViewHolder.btnFoodDetail.setOnClickListener(new FoodItemClickListener(i, new FoodItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, FoodDetail.class);
                intent.putExtra(FoodDetail.EXTRA_NAMA, getListFood().get(position).getName());
                intent.putExtra(FoodDetail.EXTRA_IMAGE, getListFood().get(position).getImage());
                intent.putExtra(FoodDetail.EXTRA_DETAIL, getListFood().get(position).getDetail());
                context.startActivity(intent);
            }
        }));

    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgImage;
        TextView tvName, tvDetail;
        Button btnFoodDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.img_item_image);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnFoodDetail = itemView.findViewById(R.id.btn_food_detail);
        }
    }
}