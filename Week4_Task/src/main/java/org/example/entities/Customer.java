package org.example.entities;

public class Customer {
    private String name;
    private String contactDetails;

    private String itemDescription;
    private int quantityToPurchase;
    private double wallet;

    public Customer(String name, String contactDetails, String itemDescription, int quantityToPurchase, double wallet) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.itemDescription = itemDescription;
        this.quantityToPurchase = quantityToPurchase;
        this.wallet = wallet;
    }

    // Getters and setters for name, contactDetails, and itemsToPurchase
    // ...


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantityToPurchase() {
        return quantityToPurchase;
    }

    public void setQuantityToPurchase(int quantityToPurchase) {
        this.quantityToPurchase = quantityToPurchase;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", itemsToPurchase='" + itemDescription + '\'' +
                ", quantityToPurchase=" + quantityToPurchase +
                ", wallet=" + wallet +
                '}';
    }

    public int getAvailableQuantity() {
        return(0);
    }
}
