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

public class EggAdapter extends RecyclerView.Adapter<EggAdapter.MyViewHolder> {

    private List<Egg> eggList;
    private Context context;

    public EggAdapter(List<Egg> eggList, Context context) {
        this.eggList = eggList;
        this.context = context;
    }

    @NonNull
    @Override
    public EggAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //skapar en ny vy från en layout-fil (R.layout.cardview) och sedan skapa en ny instans av klassen MyViewHolder,
        // som är en innerklass i EggAdapter, och returnera den.
        // Detta gör att adaptern kan skapa en ny view holder för varje element i RecyclerView, så att RecyclerView kan visa data i sin layout.
        //enkelt sakt gör den så man kan se ett kort för varje item i listan

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EggAdapter.MyViewHolder holder, int position) {
        //här får den världena för varje item och var de ska placeras ut


        //efter som jag använder de här 3 gång så är det lättar att spara det i item
        // inget man måste, gör bara så det blir mindre dry text
        Egg item = eggList.get(position);

        //här får den namnet för eggdjuret
        holder.txt_nameAnimal.setText(item.getName());

        //åldern jag använder String.valueOf för att det är en int
        holder.txt_ageAnimal.setText(String.valueOf(item.getAge()));

        //för bilden finns en super bra githublink om man vill läsa mer sök bara på
        //glid github och scrolla ner så har du allt
        Glide.with(this.context).load(item.getImgURL()).into(holder.img_Animal);

        int color_code = getRandomColor();
        holder.card_view_design.setCardBackgroundColor(holder.itemView.getResources().getColor(color_code));

    }

    @Override
    public int getItemCount() {
        //här har vi hur många items som ska vissa upp och jag väljer att vissa upp all items
        return eggList.size();
    }



    private int getRandomColor(){
        List<Integer> colorCode = new ArrayList<>();

        colorCode.add(R.color.color1);
        colorCode.add(R.color.color2);
        colorCode.add(R.color.color3);
        colorCode.add(R.color.color4);
        colorCode.add(R.color.color5);


        Random random = new Random();
        int random_color = random.nextInt(colorCode.size());
        return colorCode.get(random_color);


    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_nameAnimal, txt_ageAnimal;
        ImageView img_Animal;
        CardView card_view_design;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //hittar id i kortet (layout resors file) så jag kan sen använda dom i classen ovanför
            txt_nameAnimal = itemView.findViewById(R.id.txt_nameAnimal);
            txt_ageAnimal = itemView.findViewById(R.id.txt_ageAnimal);
            img_Animal = itemView.findViewById(R.id.img_animal);
            card_view_design = itemView.findViewById(R.id.card_view_design);

        }
    }
}
