package ru.sapteh;

public class Dog extends Animal {
    private String breеd;

    public Dog(String breеd,int age,int weight, String name){
        super(age, weight, name);
        this.breеd=breеd;
    }
    public void setBreеd(String breеd){
        this.breеd=breеd;
    }
    public String getBreеd(){
        return breеd;
    }

    @Override
    public String drive() {
        return "По земле";
    }

    @Override
    public String eat() {
        return "Мясо";
    }

    @Override
    public String voice() {
        return "Гав";
    }
    public String toString(){
        return "Name: "+ getName()+"\n"+
                "Bread: "+getBreеd()+"\n"+
                "Age: "+ getAge()+"\n"+
                "Weight: "+ getWeight()+"\n"+
                "Voice: "+ voice()+"\n"+
                "Drive: "+ drive()+"\n"+
                "Eat: "+ eat();
    }
}
