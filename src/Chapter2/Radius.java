package Chapter2;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input The Radius Of A Circle");
        int user = input.nextInt();

         int diameter = user * 2;
         double circumference = user * 2 * 3.14;
         double area = user * 3.14 * user;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: "+ circumference);
        System.out.println("Area: "+ area);



    }
}
