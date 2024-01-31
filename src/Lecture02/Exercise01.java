package Lecture02;

public class Exercise01 {
    public static void main(String[] args) {
        String firstName = "Denislav";
        String middleName = "Anatoliev";
        String lastName = "Velinov";
        String fullName = "Full Name: ";
        // The " " code block below is used for the space between the strings.
        String name = (firstName + " " + middleName + " " + lastName);
        System.out.printf (fullName + name);
    }
}