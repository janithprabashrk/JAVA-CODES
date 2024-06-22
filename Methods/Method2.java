import java.util.Scanner ;

public class Method2 {
    static void welcome(String name){
        System.out.print("WELCOME " + name);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        welcome(name);
    }
}
