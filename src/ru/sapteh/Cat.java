package ru.sapteh;

public class Cat extends Animal {
    private String color;
    public Cat(String color,int age,int weight, String name){
        super(age, weight, name);
        this.color=color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String drive() {
        return "По земле";
    }

    @Override
    public String eat() {
        return "Молоко";
    }

    @Override
    public String voice() {
        return "Мяу";
    }
    public String toString(){
        return "Color: "+getColor()+"\n"+
                "Name: "+ getName()+"\n"+
                "Age: "+ getAge()+"\n"+
                "Weight: "+ getWeight()+"\n"+
                "Voice: "+ voice()+"\n"+
                "Drive: "+ drive()+"\n"+
                "Eat: "+ eat();
    }
}
