package com.jhelsoncarrillo.reciclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jhelsoncarrillo.reciclerview.R;
import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder>
{
    private static final String TAG = "RVAdapter";

    private Context context;
    private  ArrayList<String> imageNames = new ArrayList<>();
    private  ArrayList<String> imagesURI = new ArrayList<>();

    private ArrayList<Integer> audios = new ArrayList<>();
    public ArrayList<MusicPlayer> players = new ArrayList<>();

    public RVAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI)
    {
        this.context = context;
        this.imageNames = imageNames;
        this.imagesURI = imagesURI;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item, viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI.get(position) + ".png")
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getRlContainer().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
