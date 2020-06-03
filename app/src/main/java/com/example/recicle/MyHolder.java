package com.example.recicle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyHolder extends RecyclerView.ViewHolder   implements View.OnClickListener {
    ImageView mImage_View;
    TextView mTitle_View, mDescription_View;
    ItemClickListener itemClickListener;
    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImage_View = itemView.findViewById(R.id.imagelv);
        this.mDescription_View = itemView.findViewById(R.id.descripcion);
        this.mTitle_View = itemView.findViewById(R.id.title);
        itemView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}


