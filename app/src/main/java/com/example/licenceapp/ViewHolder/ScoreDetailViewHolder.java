package com.example.licenceapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.licenceapp.R;

public class ScoreDetailViewHolder extends RecyclerView.ViewHolder {

    public TextView txtName, txtScore;

    public ScoreDetailViewHolder(@NonNull View itemView) {
        super(itemView);

        txtName = (TextView)itemView.findViewById(R.id.text_name);
        txtScore = (TextView)itemView.findViewById(R.id.text_score_detail);
    }
}
