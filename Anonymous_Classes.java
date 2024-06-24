class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Anonymous_Classes {
    public static void main(String[ ] args) {
        Machine m = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
}
/*Anonymous classes are a way to extend the existing classes on the fly.

For example, consider having a class Machine:

class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}
JAVA
When creating the Machine object, we can change the start method on the fly.
After the constructor call, we have opened the curly braces and have overridden the start method's implementation on the fly. */

