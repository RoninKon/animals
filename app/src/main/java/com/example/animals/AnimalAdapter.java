package com.example.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private final List<Animal> animals;
    private final LayoutInflater inflater;

    public AnimalAdapter(Context context, List<Animal> animal) {
        this.animals = animal;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.animalView.setImageResource(animal.getAnimalResource());
        holder.nameView.setText(animal.getName());
        holder.populationSizeView.setText(animal.getPopulationSize());
        holder.animalDescriptionView.setText(animal.getAnimalDescription());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView animalView;
        final TextView nameView, animalDescriptionView, populationSizeView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalView = itemView.findViewById(R.id.animalResource);
            nameView = itemView.findViewById(R.id.name);
            animalDescriptionView = itemView.findViewById(R.id.animalDescription);
            populationSizeView = itemView.findViewById(R.id.populationSize);

        }
    }
}
