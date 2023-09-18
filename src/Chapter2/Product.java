package Chapter2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = input.nextInt();

        System.out.println("Enter second number");
        int y = input.nextInt();

        System.out.println("Enter the third number");
        int z = input.nextInt();

        int result = x + y + z;

        System.out.printf("Product is:: %d%n", result);


    }
}
