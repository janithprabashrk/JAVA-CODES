class Vehicle {
  String color;
  Vehicle(String c) {
     color = c;
  }
}

public class Constructors {
  public static void main(String[ ] args) {
    Vehicle v = new Vehicle("Blue");
    System.out.print("Vehicle color : " + v.color);
  }
}
  

/*Vehicle
Vehicle are special methods invoked when an object is created and are used to initialize them. 

A constructor can be used to provide initial values for object attributes.

- A constructor name must be same as its class name.

- A constructor must have no explicit return type.

Example of a constructor: */