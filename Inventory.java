package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private ArrayList<Orders> inventory = new ArrayList<Orders>();

    public ArrayList<Orders> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Orders> inventory) {
        this.inventory = inventory;
    }
    public void addOrder(Orders order){
        inventory.add(order);
    }
    public String toString(){
        String output = "";
        double sum = 0;
        for (int i = 0; i < inventory.size(); i++) {
            output += "\n       " + inventory.get(i).getOrderedName();
        }
        for (int i = 0; i < inventory.size(); i++) {
            sum += inventory.get(i).getOrderedPrice();
        }
        output += "\nGrand Total        " + sum;
        return output;
    }


}


