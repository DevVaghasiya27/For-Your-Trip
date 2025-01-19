package com.example.foryourtrip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<String> imageUrls;
    private List<String> pageTexts;
    private Context context;

    public SliderAdapter(List<String> imageUrls,List<String> pageTexts, Context context) {
        this.imageUrls = imageUrls;
        this.pageTexts = pageTexts;
        this.context = context;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_slider_adapter, parent, false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        String imageUrl = imageUrls.get(position);
        String pageText = pageTexts.get(position);
        Glide.with(context).load(imageUrl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return imageUrls.size();
    }

    static class SliderViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public TextView item_txt1;

        SliderViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item1);
        }
    }
}
