package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int user1 = input.nextInt();

        System.out.print("Enter another integer: ");
        int user2 = input.nextInt();

        int sum = user1 + user2;
        System.out.println("Total: "+sum );
    }
}
