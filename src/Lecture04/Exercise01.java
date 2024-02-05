package Lecture04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your desired day of week: ");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        // Check the enhanced switch
        switch (dayOfWeek) {
            case 1:
                System.out.println("The " + dayOfWeek + "st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + dayOfWeek + "nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + dayOfWeek + "rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + dayOfWeek + "th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + dayOfWeek + "th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + dayOfWeek + "th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + dayOfWeek + "th day of the week is Sunday.");
                break;
            default:
                System.out.println("The days in a week are 7, please choose number between 1 and 7. Thank you!");
        }
    }
}