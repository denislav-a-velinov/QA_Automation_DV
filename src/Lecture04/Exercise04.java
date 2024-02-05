package Lecture04;

import java.util.Objects;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the preferred destination - Beach/Mountain");
        String destination = scanner.nextLine();

        System.out.println("Please, enter budget per person per day: ");
        int budget = Integer.parseInt(scanner.nextLine());

        if (Objects.equals(destination, "Beach")){
            if (budget < 50) {
                System.out.println("You should consider Bulgaria as a destination for your vacation.");
            } else {
                System.out.println("You should consider an outside destination for your vacation.");
            }
        } else if (Objects.equals(destination, "Mountain")){
            if (budget > 50) {
                System.out.println("You should consider Bulgaria as a destination for your vacation.");
            } else {
                System.out.println("You should consider an outside destination for your vacation");
            }
        } else {
            System.out.println("Sorry, there is no information for your search.");
        }
    }
}