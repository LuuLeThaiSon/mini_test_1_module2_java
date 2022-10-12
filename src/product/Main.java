package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countProduct = 1;

        Product[] productList = {};

        ProductManager productManager = new ProductManager();
        productManager.setProducts(productList);

       do {
           System.out.println();
           System.out.println();
           System.out.println("MENU");
           System.out.println("1. Add Product.");
           System.out.println("2. Update Product.");
           System.out.println("3. Delete Product.");
           System.out.println("4. Display Product.");
           System.out.println("5. Display Max Price Product.");
           System.out.println("0. Exit.");

           Scanner scanner = new Scanner(System.in);
           System.out.print("Your choice: ");
           int choice = scanner.nextInt();

           switch (choice) {
               case 1:
                   System.out.println("Add Product " + countProduct);
                   productManager.addProduct();
                   countProduct++;
                   break;
               case 2:
                   System.out.println("Update Product");
                   System.out.print("Enter update index: ");
                   int updateIndex = scanner.nextInt();
                   productManager.updateProduct(updateIndex);
                   break;
               case 3:
                   System.out.println("Delete Product");
                   System.out.print("Enter delete index: ");
                   int delIndex = scanner.nextInt();
                   productManager.deleteProduct(delIndex);
                   break;
               case 4:
                   System.out.println("Display Product");
                   productManager.displayProduct();
                   break;
               case 5:
                   System.out.println("Display Max Price Product");
                   productManager.displayMaxPriceProduct();
                   break;
               case 0:
                   System.exit(0);
           }
       } while (true);

    }
}
