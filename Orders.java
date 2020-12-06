package com.company;

public class Orders {
    private String orderedName;
    private double orderedPrice;

    public Orders(String orderedName, double orderedPrice) {
        this.orderedName = orderedName;
        this.orderedPrice = orderedPrice;
    }

    public Orders() {
    }

    public String getOrderedName() {
        return orderedName;
    }

    public void setOrderedName(String orderedName) {
        this.orderedName = orderedName;
    }

    public double getOrderedPrice() {
        return orderedPrice;
    }

    public void setOrderedPrice(double orderedPrice) {
        this.orderedPrice = orderedPrice;
    }

    public  String toString(){
        return orderedName + " : " + orderedPrice;
    }
}
