package com.GroupProject.models;

public class FireVillage extends Villages{
    public FireVillage(String name, String temperament, String culture, String huntingStyle, int population) {
        super(name, temperament, culture, huntingStyle, population);

        FireVillage fire = new FireVillage("fire","angry","leaderShip","katanaSwords",2000);
    }
    @Override
    public void industry(){
        System.out.println("our industry is textTile");

    }

    public void activities(){
        System.out.println("What is activities?");
    }

}
