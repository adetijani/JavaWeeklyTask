package org.example;

import org.example.entities.Customer;
import org.example.entities.Item;
import org.example.entities.Store;
import org.example.services.StoreServices;
import org.example.services.serviceImplementation.FifoServiceImp;
import org.example.services.serviceImplementation.StoreServiceImpl;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create the item
        Item item1 = new Item("White - Men's S/S Crew Tee - Small", 3.50, 150);
        Item item2 = new Item("White - Men's S/S Crew Tee - Medium", 3.75, 200);
        Item item3 = new Item("White - Men's S/S Crew Tee - Large", 4.00, 100);
        Item item4 = new Item("Charcoal - Men's S/S Crew Tee - Small", 3.50, 150);
        Item item5 = new Item("Charcoal - Men's S/S Crew Tee - Medium", 3.75, 200);
        Item item6 = new Item("Charcoal - Men's S/S Crew Tee - Large", 4.00, 100);

        ArrayList<Item> itemInStore = new ArrayList<>();
        itemInStore.add(item1);
        itemInStore.add(item2);
        itemInStore.add(item3);
        itemInStore.add(item4);
        itemInStore.add(item5);
        itemInStore.add(item6);

        Store store = new Store();


//Create Instances of customer
        Customer customer1 = new Customer("John Doe", "johndoe@gmail.com",
                "White - Men's S/S Crew Tee - Small", 60, 200.50);
        Customer customer2 = new Customer("Anita John", "anita@gmail.com",
                "White - Men's S/S Crew Tee - Medium", 100, 500.50);
        Customer customer3 = new Customer("Debo Brown", "Browndebo@gmail.com",
                "White - Men's S/S Crew Tee - Large", 80, 600.50);
        Customer customer4 = new Customer("John Boe", "johndoe@gmail.com",
                "Charcoal - Men's S/S Crew Tee - Small", 40, 300.50);

//create customer queue
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.add(customer1);
        customerQueue.add(customer2);
        customerQueue.add(customer3);
        customerQueue.add(customer4);

        // FIFO Implementation
        StoreServices fifoImp = new FifoServiceImp();

        //    Instantiate the queue
        fifoImp.instantiateQueue();

        //Adding customers to the queue
        fifoImp.addCustomerToQueue(customer1);
        fifoImp.addCustomerToQueue(customer2);
        fifoImp.addCustomerToQueue(customer3);
        fifoImp.addCustomerToQueue(customer4);

        //processing Sales
        System.out.println("FIFO LIST");
        fifoImp.processSales();

        //PRIORITY QUEUE IMPLEMENTATION
        StoreServices priorityImpl = new
        StoreServiceImpl();
        //    Instantiate the queue
        priorityImpl.instantiateQueue();

        priorityImpl.addCustomerToQueue(customer1);
        priorityImpl.addCustomerToQueue(customer2);
        priorityImpl.addCustomerToQueue(customer3);
        priorityImpl.addCustomerToQueue(customer4);

        //processing Sales
        System.out.println("PRIORITY QUEUE LIST");
        priorityImpl.processSales();
    }

}