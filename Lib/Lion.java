package Lib;

public class Lion extends Mammal implements Walkable{
    
    public Lion(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }

    @Override
    public String walk() {
        return "The Lion walk Excellent on the ground.";
    }
    
    
}
