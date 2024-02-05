package Lecture04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your age: ");
        int personAge = Integer.parseInt(scanner.nextLine());
            if( personAge >= 16){
                System.out.println("You are eligible to work. Congratulations!");
            }
            else {
                System.out.println("You're not eligible to work. Please come back later.");
            }
        }
    }
//The below example is for double-checking if the user input is integer:
//       if (scanner.hasNextInt()) {
//        System.out.println("You entered: " + personAge);
//            }
//                    else {
//                    System.out.println("ERROR: Please enter a valid integer.");
//            }