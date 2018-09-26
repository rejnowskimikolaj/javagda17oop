package main.products;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Product> productList;

    public Bill(List<Product> productList) {
        this.productList = productList;
    }

    public Bill() {
        this.productList = new ArrayList<>();
    }

    public void printProducts(){
        System.out.println(productList);
    }

    public double getGrossPriceSum(){

        double sum = 0;
        for (Product product : productList) {
            sum+=product.getGrossPrice();
        }
        return sum;
    }

    public double getNetPriceSum(){
        double sum = 0;
        for (Product product : productList) {
            double price = product.getPrice();
            sum=sum+price;
        }
        return sum;
    }

    public double howMuchGovermentSteals(){
        return getGrossPriceSum()-getNetPriceSum();
    }
}
