package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class Degg extends Animals{

    public static List<Degg> deggList = new ArrayList<>();

    public Degg(String name, int age, String imgURL) {
        super(name, age, imgURL);

        deggList.add(this);
    }

    public static void populateList() {
        new Degg("Hampus pradon", 5, "https://images.aftonbladet-cdn.se/v2/images/e1f529ca-ef0e-4196-9821-58109ee64301?fit=crop&format=auto&h=1340&q=50&w=1900&s=089e22233690ce3366ce2fcdcb90050d366f02c8");
        new Degg("Pelle Kanin", 2, "https://medier.publicwebsites.se/ponIltIpIv-1553494946/media/Nyteknik/l0aalz-apa-grady.jpg/alternates/FREE_640/apa-grady.jpg");
        new Degg("Musse Pigg", 3, "https://static.feber.se/article_images/19/53/44/195344_980.jpg");
    }
}
