package org.example.model;

public class Coke extends ProductForSale {
    private double sugarContent;

    public Coke(String type, double price, String description, double sugarContent) {
        super(type, price, description);
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public void showDetails() {
        System.out.println("===== Coke Details =====");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sugar (g): " + sugarContent);
    }
}
