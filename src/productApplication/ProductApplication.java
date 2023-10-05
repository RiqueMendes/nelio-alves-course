package productApplication;

import java.util.Locale;
import java.util.Scanner;

import productApplication.entities.Product;



public class ProductApplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the name of the product: ");
        String name = sc.nextLine();

        System.out.print("Enter the price of the product: ");
        double price = sc.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price);



        
        sc.close();

    }
}
