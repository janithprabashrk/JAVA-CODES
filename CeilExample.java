public class CeilExample {
    public static void main(String[] args) {
      double value1 = 4.3;
      double value2 = -4.3;
      double value3 = 4.0;
      double value4 = -4.0;
      double value5 = 4.999;
  
      System.out.println("Math.ceil(4.3) = " + Math.ceil(value1));   // 5.0
      System.out.println("Math.ceil(-4.3) = " + Math.ceil(value2));  // -4.0
      System.out.println("Math.ceil(4.0) = " + Math.ceil(value3));   // 4.0
      System.out.println("Math.ceil(-4.0) = " + Math.ceil(value4));  // -4.0
      System.out.println("Math.ceil(4.999) = " + Math.ceil(value5)); // 5.0
    }
  }
  
  /*Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double. */