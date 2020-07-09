package com.Lakue.blurlayoutsample;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolderImage extends RecyclerView.ViewHolder {

    private ImageView imageView;


    public ViewHolderImage(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
    }

    public void onBind(int image){
        Glide.with(itemView.getContext()).load(image).into(imageView);

    }
}
