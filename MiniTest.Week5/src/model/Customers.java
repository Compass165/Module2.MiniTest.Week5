package model;


import java.io.Serializable;

public class Customers implements Serializable {
    private String name;
    private int number;
    private String electricMeterId;

    private Bill bill;

    public Customers() {
    }

    public Customers(String name, int number, String electricMeterId, Bill bill) {
        this.name = name;
        this.number = number;
        this.electricMeterId = electricMeterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getElectricMeterId() {
        return electricMeterId;
    }

    public void setElectricMeterId(String electricMeterId) {
        this.electricMeterId = electricMeterId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "customers{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", electricMeterId='" + electricMeterId + '\'' +
                '}';
    }
}
