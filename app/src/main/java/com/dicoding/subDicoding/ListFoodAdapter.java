package com.dicoding.subDicoding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.subDicoding.Food;
import com.dicoding.subDicoding.R;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Food> listFood;

    public ArrayList<Food> getListFood() {
        return listFood;
    }

    void setListFood(ArrayList<Food> listDestinasi) {
        this.listFood = listDestinasi;
    }

    ListFoodAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ListFoodAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFoodAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListFood().get(position).getName());
        categoryViewHolder.tvDetail.setText(getListFood().get(position).getDetail());

        Glide.with(context)
                .load(getListFood().get(position).getImage())
                .placeholder(R.drawable.bakso)
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgImage);

    }

    @Override
    public int getItemCount() {
        return getListFood().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDetail;
        ImageView imgImage;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            imgImage = itemView.findViewById(R.id.img_item_image);
        }
    }
}
