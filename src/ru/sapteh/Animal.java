package ru.sapteh;

import java.util.Map;

public abstract class Animal implements Voice, Eat,Drive{
    private int age;
    private int weight;
    private String name;

    public Animal(int age, int weight, String name){
        this.age=age;
        this.name=name;
        this.weight=weight;
    };
    public Animal(){};
    public Animal(int age,String name){
        this.age=age;
        this.name=name;
    };
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setName(String name){
        this.name=name;
    }
  public String voice(){
        return null;
  }
  public String drive(){
        return null;
  }
  public String eat(){
        return null;
  }
  public String toString(){
        return "Name: "+ getName()+"\n"+
                "Age: "+ getAge()+"\n"+
                "Weight: "+ getWeight()+"\n"+
                "Voice: "+ voice()+"\n"+
                "Drive: "+ drive()+"\n"+
                "Eat: "+ eat();
  }

}
