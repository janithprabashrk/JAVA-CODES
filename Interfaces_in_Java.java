/*An interface is a completely abstract class that contains only abstract methods.

Some specifications for interfaces:

- Defined using the interface keyword.

- May contain only static final variables.

- Cannot contain a constructor because interfaces cannot be instantiated.

- Interfaces can extend other interfaces.

- A class can implement any number of interfaces */

interface Animal {
    public void eat();
    public void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}

public class Interfaces_in_Java {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}