package productApplication;

import java.util.Locale;
import java.util.Scanner;

import product.Product;

public class ProductApplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter the name of the product: ");
        product.name = sc.nextLine();

        System.out.print("Enter the price of the product: ");
        product.price = sc.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        product.quantity = sc.nextInt();

        System.out.println(); // pular linha
        System.out.print("Product Data: " + product); // ToString

        System.out.println(); // pular linha
        System.out.println("Enter the number of products to be added in stock: "); // pular linha
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println(); // pular linha
        System.out.print("Updated Data: " + product); // ToString

        System.out.println(); // pular linha
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);


        System.out.println(); // pular linha
        System.out.print("Product Data: " + product); // ToString
        sc.close();

    }
}
