package product;

import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    Product[] products;

    public ProductManager() {
        products = new Product[0];
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct() {

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Price: ");
        int price = scanner.nextInt();

        System.out.print("Description: ");
        String description = scanner.next();

        Product product = new Product(name, price, description);

        Product[] newProducts= new Product[products.length+1];

        for (int i = 0; i < products.length; i++){
            newProducts[i] = products[i];
        }

        newProducts[newProducts.length-1] = product;

        this.products = newProducts;
    }

    public void updateProduct(int updateIndex) {
        String updateName;
        int updatePrice;
        String updateDescription;

        System.out.print("New name: ");
        updateName = scanner.next();
        products[updateIndex].setName(updateName);

        System.out.print("New price: ");
        updatePrice = scanner.nextInt();
        products[updateIndex].setPrice(updatePrice);

        System.out.print("New description: ");
        updateDescription = scanner.next();
        products[updateIndex].setDescription(updateDescription);

//        this.products = products;
    }

    public void deleteProduct(int delIndex) {
        Product[] newProducts = new Product[products.length-1];
        int newIndex = 0;
        for (int i = 0; i < delIndex; i++) {
            newProducts[newIndex] = products[i];
            newIndex++;
        }

        for (int i = delIndex+1; i < products.length; i++) {
            newProducts[newIndex] = products[i];
            newIndex++;
        }

        this.products = newProducts;
    }

    public void displayProduct() {
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i].getName() + ", ");
            System.out.print(products[i].getPrice() + ", ");
            System.out.println(products[i].getDescription() + "; ");
        }
    }

    public void displayMaxPriceProduct() {
        int max = products[0].getPrice();
        String name = products[0].getName();
        for (int i = 0; i < products.length; i++) {
           if (max < products[i].getPrice()) {
               max = products[i].getPrice();
               name = products[i].getName();
           }
        }

        System.out.println("Max Price Product: " + name + " " + max);
    }
}
