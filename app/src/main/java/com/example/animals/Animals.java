package com.example.animals;

public abstract class Animals {

    private String name;
    private int age;
    private String imgURL;
    private int Species_id;

    public Animals(String name, int age, String imgURL, int species_id) {
        this.name = name;
        this.age = age;
        this.imgURL = imgURL;
        Species_id = species_id;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", imgURL='" + imgURL + '\'' +
                ", Species_id=" + Species_id +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getSpecies_id() {
        return Species_id;
    }

    public void setSpecies_id(int species_id) {
        Species_id = species_id;
    }
}