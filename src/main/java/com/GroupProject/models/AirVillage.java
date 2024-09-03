package com.GroupProject.models;

public class AirVillage extends Villages {

    AirVillage aVillage = new AirVillage("air","spiritual","fluidGerontocracy","hydrogenBomb",200);

    public AirVillage(String name, String temperament, String culture, String huntingStyle, int population) {
        super(name, temperament, culture, huntingStyle, population);
    }

    public void activities(){
        System.out.println("What is activities?");
    }

    public void industry(){
        System.out.println("What is industry?");
    }


}