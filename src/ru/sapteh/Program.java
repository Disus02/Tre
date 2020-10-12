package ru.sapteh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args){
        Dog dog = new Dog("Brodaga",12,7,"Sharik");
        System.out.println(dog.toString());
        Cat cat=new Cat("Black",3,10,"Miron");
        Bird bird= new Bird("Пернатый",1,1,"Egorka");
        try {
            FileOutputStream fos = new FileOutputStream("Animal.bin");

            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(dog);

        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
