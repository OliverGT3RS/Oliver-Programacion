package Reto5.Reto5_3.Data;

import java.util.ArrayList;

/**
 * This class manages products by adding products to a list, calculating the total amount for each product,
 * and displaying the list of products.
 */
public class ProductManager {

    /**
     * Adds a product to the list of products.
     */
    public void addProduct(ArrayList<Product> productList, Product product){
        productList.add(new Product(product.name, product.price,
                product.quantity, product.totalAmount));
    }

    /**
     * Calculates the total amount for a product based on its quantity and price.
     */
    public void calculateTotalAmount(Product product){
        product.totalAmount = product.quantity * product.price;
    }

    /**
     * Displays the list of products.
     */
    public void showProductList(ArrayList<Product> productList){
        System.out.println(productList);
    }
}
