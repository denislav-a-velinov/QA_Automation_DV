package Lecture04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter unit price: ");
        int productUnitPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter quantity of the product: ");
        int productQuantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Your product price per unit is: " + productUnitPrice + "$");
        System.out.println("Your product quantity is: " + productQuantity + "pcs");
        int totalPrice = productQuantity * productUnitPrice;
        System.out.println("Your total is: " + totalPrice + "$");

        if (productQuantity >= 100 && productQuantity <= 120) {
            System.out.println("Your discount rate is 15%");
        } else if (productQuantity > 120) {
            System.out.println("Your discount rate is 20%");
        } else {
            System.out.println("Your discount rate is 0%");
        }

        double discount = 0;
        if (productQuantity >= 100 && productQuantity <= 120) {
            discount = 0.15 * totalPrice;
        } else if (productQuantity > 120) {
            discount = 0.20 * totalPrice;
        }

        double revenueTotal = totalPrice - discount;

        System.out.println("The revenue from the sale is: " + revenueTotal + "$");
        System.out.println("Your discount is: " + discount + "$" + "(" + (discount / totalPrice * 100) + "%)");
        }
    }