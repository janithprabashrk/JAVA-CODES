/*When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.*/
//In Java, the static keyword is used to indicate that a member (variable or method) belongs to the class itself rather than to instances of the class.
class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

public class StaticEX {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }
}