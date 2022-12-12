package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class Egg extends Animals{

    public static List<Egg> eggList = new ArrayList<>();

    public Egg(String name, int age, String imgURL, int species_id) {
        super(name, age, imgURL, species_id);

        eggList.add(this);
    }

    // This is a method that returns the content of the list
    public static List<Egg> getEggList() {
        return eggList;
    }

    // Metod för att fylla listan
    public static void populateList() {
        new Egg("Kalle Anka", 1, "https://example.com/kalle_anka.png",2);
        new Egg("Pelle Kanin", 2, "https://example.com/pelle_kanin.png",2);
        new Egg("Musse Pigg", 3, "https://example.com/musse_pigg.png",2);
    }
}
