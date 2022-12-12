package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class Egg extends Animals{

    public static List<Egg> eggList = new ArrayList<>();

    public Egg(String name, int age, String imgURL) {
        super(name, age, imgURL);

        eggList.add(this);
    }

    // Metod för att fylla listan
    public static void populateList() {
        new Egg("Kalle Anka", 1, "https://example.com/kalle_anka.png");
        new Egg("Pelle Kanin", 2, "https://example.com/pelle_kanin.png");
        new Egg("Musse Pigg", 3, "https://example.com/musse_pigg.png");
    }
}
