package edu.northeastern.mengyi;

import java.util.LinkedList;

public class ShoppingCart {
    LinkedList<Item> itemList;

    public ShoppingCart() {
        itemList = new LinkedList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public int calculateTotal() {
        int total = 0;
        for(Item item : itemList) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(this.calculateTotal());
    }
}