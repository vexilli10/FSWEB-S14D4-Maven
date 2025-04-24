package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            p.showDetails();
            System.out.println("Sales price for 1 unit: " + p.getSalesPrice(1));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Dark", 2.50, "Rich dark chocolate", 70.0),
                new Coke("Classic", 1.25, "Refreshing soda drink", 39.0),
                new Bread("Whole Wheat", 3.00, "Healthy bread loaf", 500)
        };

        new Store().listProducts(products);
    }
}
