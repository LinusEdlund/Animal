package com.example.animals;

public abstract class Animals {

    private String name;
    private int age;
    private String imgURL;

    public Animals(String name, int age, String imgURL) {
        this.name = name;
        this.age = age;
        this.imgURL = imgURL;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", imgURL='" + imgURL + '\'' +
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
}
