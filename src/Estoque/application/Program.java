package Estoque.application;

import java.util.Scanner;

import Estoque.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        
        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}
