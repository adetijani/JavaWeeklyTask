package org.example.entities;

public class Item {
    private String description;
    private double unitPrice;
    private int availableQuantity;

    public Item(String description, double unitPrice, int availableQuantity) {
        this.description = description;
        this.unitPrice = unitPrice;
        this.availableQuantity = availableQuantity;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // Getters and setters for description and unitPrice
    // ...

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' + ", unitPrice=" + unitPrice +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
