package com.GroupProject.models;
import com.GroupProject.models.*;


public class WaterVillage extends Villages {
    public WaterVillage(String name, String temperament, String culture, String huntingStyle, int population) {
        super(name, temperament, culture, huntingStyle, population);
    }
    WaterVillage wVillage = new WaterVillage("water","calm","developingYouth","sphere",200);

    @Override
    public void industry() {
        System.out.println("our industry is medical");
    }



    public void activities(){
        System.out.println("What is activities?");
    }
}
