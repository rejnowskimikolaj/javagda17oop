package main.products;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("kaszanka",12.0,Tax.VAT8);
        Product product2 = new Product("kabanos",11.0,Tax.VAT8);
        Product product3 = new Product("chleb",3.5,Tax.NO_VAT);
        Product product4 = new Product("dvd",5.0,Tax.VAT23);

//        System.out.println(Arrays.asList(product1,product2,product3,product4));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Bill bill = new Bill(products);
        bill.printProducts();

        System.out.println(product1.getGrossPrice());



//        List<Product> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        System.out.println(list);
//        System.out.println(list.get(0));


    }
}
