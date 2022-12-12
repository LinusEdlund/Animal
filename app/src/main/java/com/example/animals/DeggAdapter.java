package com.example.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeggAdapter extends RecyclerView.Adapter<DeggAdapter.ViewHolder>{

    //orkar inte kommentera igen det här är samma som eggAdapter bara att du byter lista
    //och ja tyvärr behöver du ha en adapter för varje recycler view :(

    private List<Degg> deggList;
    private Context context;


    public DeggAdapter(List<Degg> deggList, Context context) {
        this.deggList = deggList;
        this.context = context;
    }

    @NonNull
    @Override
    public DeggAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeggAdapter.ViewHolder holder, int position) {

        Degg item = deggList.get(position);
        holder.txt_nameAnimal.setText(item.getName());
        holder.txt_ageAnimal.setText(String.valueOf(item.getAge()));
        Glide.with(this.context).load(item.getImgURL()).into(holder.img_Animal);

        int color_code = getRandomColor();
        holder.card_view_design.setCardBackgroundColor(holder.itemView.getResources().getColor(color_code));

    }

    @Override
    public int getItemCount() {
        return deggList.size();
    }


    private int getRandomColor(){
        List<Integer> colorCode = new ArrayList<>();

        colorCode.add(R.color.color11);
        colorCode.add(R.color.color12);
        colorCode.add(R.color.color13);
        colorCode.add(R.color.color14);
        colorCode.add(R.color.color15);


        Random random = new Random();
        int random_color = random.nextInt(colorCode.size());
        return colorCode.get(random_color);


    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_nameAnimal, txt_ageAnimal;
        ImageView img_Animal;
        CardView card_view_design;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_nameAnimal = itemView.findViewById(R.id.txt_nameAnimal);
            txt_ageAnimal = itemView.findViewById(R.id.txt_ageAnimal);
            img_Animal = itemView.findViewById(R.id.img_animal);
            card_view_design = itemView.findViewById(R.id.card_view_design);

        }
    }
}
