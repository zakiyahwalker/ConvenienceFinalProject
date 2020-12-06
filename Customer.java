package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Customer {
    private String name;
    private ArrayList<Orders> cusorder = new ArrayList<Orders>();

    public Customer(String name, ArrayList<Orders> cusorder) {
        this.name = name;
        this.cusorder = cusorder;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Orders> getCusorder() {
        return cusorder;
    }

    public void setCusorder(ArrayList<Orders> cusorder) {
        this.cusorder = cusorder;
    }

    public void addItem(Orders order){
        cusorder.add(order);
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        String output = "";
        output += name;
        for (int i = 0; i < cusorder.size(); i++) {
            output += "\n       " + cusorder.get(i).getOrderedName();
        }
        double sum = 0;
        for (int i = 0; i < cusorder.size(); i++) {
            sum += cusorder.get(i).getOrderedPrice();
        }
        output += "\nTotal:                "+ df.format(sum);
        output += "\n-------------------------------\n";
        return output;
    }

}
