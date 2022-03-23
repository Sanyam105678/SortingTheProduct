package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {


    public static void main(String[] args) {
	// write your code here
        TreeSet<Product> ts = new TreeSet<>(new ProductIdComp());
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for sorting products according to Product Price");
        System.out.println("Press 2 for sorting products according to Product Name");
        System.out.println("Press 3 for sorting products according to Product Id");
        int n = sc.nextInt();
        if(n==1){
            ts=new TreeSet<>(new ProductPriceComp());
        }
        else if(n==2){
            ts=new TreeSet<>(new ProductNameComp());
        }
        else{
            ts=new TreeSet<>(new ProductIdComp());
        }


        for(int i=0;i<4;i++){
            System.out.println("Enter Details of Product"+(i+1));
            System.out.println("Enter Product ID:");
            int id = sc.nextInt();
            System.out.println("Enter Product Name:");
            String name = sc.next();
            System.out.println("Enter Product price:");
            double price = sc.nextDouble();





            Product p = new Product(id,name,price);
            ts.add(p);


        }

        System.out.println(ts);
    }
}
