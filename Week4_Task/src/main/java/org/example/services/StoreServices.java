package org.example.services;

import org.example.entities.Customer;
import org.example.entities.Store;

public interface StoreServices {
    String purchaseItem (Store store);


    void instantiateQueue();

    void addCustomerToQueue(Customer customer);

    void processSales();

    String purchaseProduct(Store store);
}
