package Lecture02;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Given sides for the triangle - b=5 and h=10");
        int triangleHeight = 10;
        int sideTwo = 5;
        int triangleTotal = (triangleHeight * sideTwo / 2);
        String triangleArea = "The area of the triangle is ";
        System.out.println(triangleArea + triangleTotal);
    }
}