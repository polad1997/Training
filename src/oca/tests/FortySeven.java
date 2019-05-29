package oca.tests;

public class FortySeven {

    public static void main(String[] args) {
        Product product = new Product();
        product.price = 200;
        double newPrice = 100;
        FortySeven fortySeven = new FortySeven();
        fortySeven.update(product, newPrice);
        System.out.println(product.price + "  " + newPrice);
    }

    static void update(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }

}

class Product {
    double price;
}