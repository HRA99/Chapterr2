package Chapter2;

import java.util.Objects;
import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer =input.nextInt();
        if (integer > 100){
            System.out.printf("%d", integer > 100);
        }
//        System.out.println(Objects.hash("Semicolon"));

    }
}
