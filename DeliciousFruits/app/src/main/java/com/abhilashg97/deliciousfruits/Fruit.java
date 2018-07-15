package com.abhilashg97.deliciousfruits;

public class Fruit {

    private String fruitName;
    private int imageID;

    public Fruit(String fruitName, int imageID) {
        this.fruitName = fruitName;
        this.imageID = imageID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getImageID() {
        return imageID;
    }

}
