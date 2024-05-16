package Reto5.Reto5_5.Data;

import java.util.ArrayList;

/**
 * This class manages items by adding items to a cart, calculating the net amount for each item,
 * and displaying the cart.
 */
public class ItemManager {

    /**
     * Adds an item to the cart.
     */
    public void addItem(ArrayList<Item> cart, Item item){
        cart.add(new Item(item.name, item.price, item.vat,
                item.netAmount, item.quantity));
    }

    /**
     * Calculates the net amount for an item based on its price and VAT.
     */
    public void calculateNetAmount(Item item){
        item.netAmount = item.price + (item.price * item.vat);
    }

    /**
     * Displays the cart containing the list of items.
     */
    public void showCart(ArrayList<Item> cart){
        System.out.println(cart);
    }
}
