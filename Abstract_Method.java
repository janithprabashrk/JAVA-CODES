/*The makeSound() method is also abstract, as it has no implementation in the superclass.
We can inherit from the Animal class and define the makeSound() method for the subclass: */

abstract class Animal {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Abstract_Method {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}