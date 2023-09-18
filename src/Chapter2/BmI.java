package Chapter2;

import java.util.Scanner;

public class BmI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in inchies");
        double height = scanner.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("Your BMI is " + BMI);
    }
}
