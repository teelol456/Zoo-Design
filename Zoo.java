import Lib.*;
import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

        for(Animal a:animals){
            System.out.print(a.getName() + " ");
            System.out.println(a.makeSound());
        }

        for(Animal a:animals){
            if(a instanceof Flyable){
                System.err.println(((Flyable)a).fly());
            }
            else if(a instanceof Swimable){
                System.err.println(((Swimable)a).swim());
            }
        }
    }
}
