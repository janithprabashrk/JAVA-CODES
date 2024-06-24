/*Similarly, Math.floor() rounds a floating point value down to the nearest integer value.*/
public class FloorExample {
    public static void main(String[] args) {
      double value1 = 4.3;
      double value2 = -4.3;
      double value3 = 4.0;
      double value4 = -4.0;
      double value5 = 4.999;
  
      System.out.println("Math.floor(4.3) = " + Math.floor(value1));   // 4.0
      System.out.println("Math.floor(-4.3) = " + Math.floor(value2));  // -5.0
      System.out.println("Math.floor(4.0) = " + Math.floor(value3));   // 4.0
      System.out.println("Math.floor(-4.0) = " + Math.floor(value4));  // -4.0
      System.out.println("Math.floor(4.999) = " + Math.floor(value5)); // 4.0
    }
  }
  