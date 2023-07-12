package org.example.entities;

import java.util.ArrayList;
import java.util.Queue;

public class Store {
    private ArrayList<Item> storeItems;
    private Queue<Customer> customerQueue;

    public Store(ArrayList<Item> storeItems, Queue<Customer> customerQueue) {
        this.storeItems = storeItems;
        this.customerQueue = customerQueue;
    }


    public Store() {
    }

    public ArrayList<Item> getStoreItems() {
        return storeItems;
    }

    public void setStoreItems(ArrayList<Item> storeItems) {
        this.storeItems = storeItems;
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeItems=" + storeItems +
                ", customerQueue=" + customerQueue +
                '}';
    }
}
