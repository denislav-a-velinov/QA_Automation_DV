package Lecture02;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Given sides for the triangle - a=5, b=5 and c=10");
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 10;
        int perimeterTotal = (sideOne + sideTwo + sideThree);
        String trianglePerimeter = "The perimeter of the triangle is ";
        // The "\n" code block below is used to print the line after it on a new row.
        System.out.println(trianglePerimeter + perimeterTotal);
    }
}