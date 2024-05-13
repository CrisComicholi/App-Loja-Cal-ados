package com.example.myapplicationlojadecalcados.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationlojadecalcados.databinding.ShoesItemBinding;
import com.example.myapplicationlojadecalcados.model.Shoes;

import java.util.ArrayList;

public class ShoesAdapter extends RecyclerView.Adapter<ShoesAdapter.ShoesViewHolder> {

    private final ArrayList<Shoes> shoesList;
    private final Context context;

    public ShoesAdapter(ArrayList<Shoes> shoesList, Context context) {
        this.shoesList = shoesList;
        this.context = context;
    }


    @NonNull
    @Override
    public ShoesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ShoesItemBinding listItem;
        listItem = ShoesItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new ShoesViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoesViewHolder holder, int position) {
        holder.binding.imgShoes.setBackgroundResource(shoesList.get(position).getImgShoes());
        holder.binding.txtShoesName.setText(shoesList.get(position).getShoesName());
        holder.binding.txtShoesDescription.setText(shoesList.get(position).getShoesDescription());
        holder.binding.txtPrice.setText(shoesList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return shoesList.size();
    }

    public static class ShoesViewHolder extends RecyclerView.ViewHolder {

        ShoesItemBinding binding;

        public ShoesViewHolder(ShoesItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
