package ru.sapteh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Program1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Animal.bin");
            ObjectInputStream obj = new ObjectInputStream(fis);

            Dog dog = (Dog) obj.readObject();

            System.out.println(dog.toString());
            fis.close();
            obj.close();

        }catch (IOException | ClassNotFoundException e){
            e.getStackTrace();
        }
    }
}
