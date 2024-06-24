class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Anonymus_Functions_2 {
    public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        Machine m2 = new Machine();
        m2.start();
    }
}

/*The modification is applicable only to the current object, and not the class itself. 
So if we create another object of that class, 
the start method's implementation will be the one defined in the class. */