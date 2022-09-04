package controller;

import model.Bill;
import model.Customers;

public class CustomersView {
    public void displayCustomers(String name, int number, String electricMeterId, Bill bill) {
        System.out.printf("%-20s%-20s%-20s%-30s\n","Name","Number","Electric Meter ID","Bill");
        System.out.printf("%-20s%-20s%-20s%-30s\n",name,number,electricMeterId,bill);
    }
}
