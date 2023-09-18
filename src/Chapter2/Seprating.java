package Chapter2;

import java.util.Scanner;

public class Seprating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number Consist Of Five Digits");
        int user = input.nextInt();
        int separate = user % 10;
        if (separate == user/10){
            System.out.println(user);

        }


    }
}
