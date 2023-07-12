package org.example.services.serviceImplementation;

import org.example.entities.Customer;
import org.example.entities.Store;
import org.example.services.StoreServices;

import java.util.LinkedList;
import java.util.Queue;

public class FifoServiceImp implements StoreServices {
    private Queue<Customer> queue;


    @Override
    public String purchaseItem(Store store) {
        return null;
    }

    @Override
    public void instantiateQueue() {
        queue = new LinkedList<> ();

    }


    @Override
    public void processSales() {
        try {
            if (!queue.isEmpty ())
                queue.forEach (customer -> System.out.println ("Processing sale for customer: " + customer.getName () + "(Quantity to buy: "+ customer.getQuantityToPurchase()));
            else if (queue.isEmpty ()){
                System.out.println ("No customers in the queue.");
            }else
                return;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong : " + e.getStackTrace()[0].toString());
        }
    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        queue.add (customer);

    }

    @Override
    public String purchaseProduct(Store store) {
        return null;
    }
}
