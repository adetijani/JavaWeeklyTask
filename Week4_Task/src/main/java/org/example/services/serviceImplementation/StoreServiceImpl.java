package org.example.services.serviceImplementation;

import org.example.entities.Customer;
import org.example.entities.Store;
import org.example.services.StoreServices;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class StoreServiceImpl implements StoreServices {
    private PriorityQueue<Customer> queue;
    private Queue<Customer> normalQueue;


    @Override
    public String purchaseItem(Store store) {
        return null;
    }

    @Override
    public void instantiateQueue() {
        queue = new PriorityQueue(Comparator.comparingInt(Customer::getQuantityToPurchase).reversed ());
    }
    @Override
    public void processSales() {
        try {
            System.out.println("Processing sales:");
            if (!queue.isEmpty ()) {
                queue.forEach (customer -> System.out.println ("Sale processed for " + customer.getName () + " (Quantity to purchase: " + customer.getQuantityToPurchase()+ ")"));
// if (!queue.isEmpty())
// queue.poll (customer -> System.out.println ("Sale processed for " + customer.getName() + " (Quantity to purchase: " + customer.getQuantityToPurchase() + ")"));
            }else System.out.println ("No customers in the queue.");

        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }

    @Override
    public void addCustomerToQueue(Customer customer) {
        queue.add (customer);
// System.out.println("Processing sales:");
    }

    @Override
    public String purchaseProduct(Store store) {
        return null;
    }
}


