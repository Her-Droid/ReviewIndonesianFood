package com.dicoding.subDicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FoodDetail extends AppCompatActivity {
    public static final String EXTRA_NAMA= "extra_name";
    public static final String EXTRA_IMAGE= ("extra_image");
    public static final String EXTRA_DETAIL= "extra_detail";

    TextView tvNama, detailTxt;
    ImageView imgImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        tvNama = findViewById(R.id.tv_item_name);
        imgImage = findViewById(R.id.img_item_image);
        detailTxt = findViewById(R.id.tv_item_detail);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String image = getIntent().getStringExtra(EXTRA_IMAGE);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);


        tvNama.setText(nama);
        detailTxt.setText(detail);
        Glide.with(FoodDetail.this)
                .load(image).apply(new RequestOptions()
                .placeholder(R.drawable.bakso)
                .override(350, 550))
                .into(imgImage);
    }
}
