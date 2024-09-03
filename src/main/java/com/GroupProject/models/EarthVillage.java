package com.GroupProject.models;

public class EarthVillage extends Villages{

EarthVillage eVillage = new EarthVillage("earth","weary","society","broadSword",300);

    public EarthVillage(String name, String temperament, String culture, String huntingStyle, int population) {
        super(name, temperament, culture, huntingStyle, population);
    }

    public void industry(){
        System.out.println("What is industry?");
    }

    public void activities(){
        System.out.println("What is activities?");
    }
}
