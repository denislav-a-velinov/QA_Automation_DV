package Lecture02;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("Task 2: Print the perimeter of a triangle by given sides. Use formula to calculate it:");
        System.out.println("Let's check what is the perimeter of your triangle. Follow the steps below:");
        Scanner sideA = new Scanner(System.in);
        System.out.println("Enter side A of the triangle");
        int firstSide = Integer.parseInt(sideA.nextLine());
        System.out.println("Side A is: " + firstSide);
        Scanner sideB = new Scanner(System.in);
        System.out.println("Enter site B of the triangle");
        int secondSide = Integer.parseInt(sideB.nextLine());
        System.out.println("Side B is: " + secondSide);
        Scanner sideC = new Scanner(System.in);
        System.out.println("Enter side C of the triangle");
        int thirdSide = Integer.parseInt(sideC.nextLine());
        System.out.println("Side C is: " + thirdSide);
        System.out.println("Thank you for the cooperation.");
        int finalResult = (firstSide + secondSide + thirdSide);
        String finalSolutionPerimeter = "The perimeter of your triangle is: ";
        System.out.println(finalSolutionPerimeter + finalResult + "\n");

        System.out.println("Task 3: Print the area of a triangle by given sides. Use formula to calculate it:");
        System.out.println("Let's check what is the area of your triangle. Follow the steps below:");
        Scanner theSide = new Scanner(System.in);
        System.out.println("Enter side B of the triangle");
        int neededSide = Integer.parseInt(theSide.nextLine());
        System.out.println("Side B is: " + neededSide);
        Scanner height = new Scanner(System.in);
        System.out.println("Enter the height of the triangle");
        int theHeight = Integer.parseInt(height.nextLine());
        System.out.println("The height is: " + theHeight);
        int totalArea = (neededSide * theHeight / 2);
        String finalSolutionArea = "The area of your triangle is: ";
        System.out.println(finalSolutionArea + totalArea);
    }
}