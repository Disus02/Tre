package ru.sapteh;

public class Bird extends Animal {
private String view;
    public Bird(String view,int age,int weight, String name){
        super(age, weight, name);
        this.view=view;
    }
    public void setView(String view){
        this.view=view;
    }
    public String getView(){
        return view;
    }

    @Override
    public String drive() {
        return "По воздуху";
    }

    @Override
    public String eat() {
        return "Черви";
    }

    @Override
    public String voice() {
        return "Кар";
    }
    public String toString(){
        return "Name: "+ getName()+"\n"+
                "View: "+getView()+"\n"+
                "Age: "+ getAge()+"\n"+
                "Weight: "+ getWeight()+"\n"+
                "Voice: "+ voice()+"\n"+
                "Drive: "+ drive()+"\n"+
                "Eat: "+ eat();
    }
}
