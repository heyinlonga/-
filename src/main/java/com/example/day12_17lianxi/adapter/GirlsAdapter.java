package com.example.day12_17lianxi.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.day12_17lianxi.R;
import com.example.day12_17lianxi.bean.GirlsBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GirlsAdapter extends RecyclerView.Adapter<GirlsAdapter.ViewHolder> {
    private Context context;
    private ArrayList<GirlsBean.DataBean> list;

    public GirlsAdapter(Context context, ArrayList<GirlsBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_girls, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GirlsBean.DataBean dataBean = list.get(position);
        Glide.with(context).load(dataBean.getUrl()).into(holder.ivUrl);
        holder.tvTitle.setText(Html.fromHtml("<h1>"+dataBean.getTitle()+"</h1>"
        +"<h6>"+dataBean.getDesc()+"</h6>"));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static
    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_url)
        ImageView ivUrl;
        @BindView(R.id.tv_title)
        TextView tvTitle;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
