import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();
        

        System.out.println("End of program!");

    }

    public static void method1() {
        System.out.println("***START MEETHOD1***");
        method2();
        System.out.println("***END METHOD1***");
    }


   public static void method2() {
    System.out.println("***METHOD 2 START ***");
    Scanner sc = new Scanner(System.in);

    try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid position");
        e.printStackTrace();
        sc.next();
    }
    catch (InputMismatchException e) {
        System.out.println("input error!");
    }
    sc.close();
        System.out.println("***METHOD2 END***");

    }
    
}
