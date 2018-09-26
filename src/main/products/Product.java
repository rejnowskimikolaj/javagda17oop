package main.products;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private Tax tax;

    public Product(String name, double price, Tax tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Tax getTax() {
        return tax;
    }

    public double getGrossPrice(){
        return price+price*tax.getValue();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                tax == product.tax;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, tax);
    }
}
