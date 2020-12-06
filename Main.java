package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Store> inventory = new ArrayList<Store>();

        Store st = new Store("Red-Hot Spicy Doritos",2.99);
        inventory.add(st);
        st = new Store("Cool Ranch Doritos",2.99);
        inventory.add(st);
        st = new Store("Coke",0.99);
        inventory.add(st);
        st = new Store("Diet Coke",0.99);
        inventory.add(st);
        st = new Store("Pepsi",0.99);
        inventory.add(st);
        st = new Store("Five Hour Energy",3.99);
        inventory.add(st);
        st = new Store("Sunflower Seeds",0.99);
        inventory.add(st);
        st = new Store("Peanuts",0.99);
        inventory.add(st);
        st = new Store("Mac Book Chargers",120);
        inventory.add(st);
        st = new Store("Dell Chargers",50);
        inventory.add(st);

        System.out.println("Welcome to the Store!");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).getProducts() +
                    "  :  " + inventory.get(i).getPrices());
        }
        System.out.println();
// Starting order
        Scanner input = new Scanner(System.in);
        Orders order = new Orders();
        Customer customer = new Customer();
        Inventory inventory1 = new Inventory();
        String action = "";
        String build = "";


       do {
            System.out.println("What do you need to do? \nTo Add Customer, type \"1\". To Close, type \"Close\"");
            action = input.nextLine();
            //add customer
           if (action.equals("1")){
               System.out.print("Customer name: ");
               String cus = input.nextLine();
               customer = new Customer();
               customer.setName(cus);
               // Loop for items for inputted customer
               String item = "";
               do {
                   System.out.println("What do you want to buy? If done, type \"Done\"");
                   item = input.nextLine();
                   int index = -1;
                   for (int i = 0; i < inventory.size(); i++) {
                       if (inventory.get(i).getProducts().equals(item)) {
                           index = i;
                       }
                   }
                   if (index == -1) {
                       System.out.println();
                   } else {
                       String purProd = inventory.get(index).getProducts();
                       Double purPrice = inventory.get(index).getPrices();
                       order = new Orders();
                       order.setOrderedName(purProd);
                       order.setOrderedPrice(purPrice);
                       customer.addItem(order);
                       inventory1.addOrder(order);
                       System.out.println("Cost: " + order.getOrderedPrice());
                   }
               } while (! item.equals("Done"));
               build += customer.toString();
           } else {
               System.out.println();
           }
        } while (! action.equals("Close"));
        System.out.println("Closing");
        System.out.println("RECEIPTS");
        System.out.println(build);
        System.out.print("INVENTORY SOLD");
        System.out.println(inventory1.toString());
        }

    }
