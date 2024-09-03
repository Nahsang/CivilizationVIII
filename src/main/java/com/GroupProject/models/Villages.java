package com.GroupProject.models;

public class Villages {

  String name;
  String temperament;
  String culture;
  String huntingStyle;
  int population;

  public void industry(){
   System.out.println("What is industry?");
  }

  public void activities(){
   System.out.println("What is activities?");
  }


  public Villages(String name, String temperament, String culture, String huntingStyle, int population) {
    this.name = name;
    this.temperament = temperament;
    this.culture = culture;
    this.huntingStyle = huntingStyle;
    this.population = population;
  }

  public Villages() {
  }
}
