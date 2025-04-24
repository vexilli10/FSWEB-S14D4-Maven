package org.example.model;

public class Bread extends ProductForSale {
    private int weightGram;

    public Bread(String type, double price, String description, int weightGram) {
        super(type, price, description);
        this.weightGram = weightGram;
    }

    public int getWeightGram() {
        return weightGram;
    }

    @Override
    public void showDetails() {
        System.out.println("===== Bread Details =====");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Weight (g): " + weightGram);
    }
}
