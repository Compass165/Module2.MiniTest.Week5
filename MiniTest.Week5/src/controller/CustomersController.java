package controller;

import model.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomersController {

    private String name;
    public static List<Customers> customersList = new ArrayList<>();

    public void addNewCustomer(Customers customers) {
        customersList.add(customers);
    }

    public void editCustomerById(int index, Customers customers){
        customersList.set(index,customers);
    }

    public void deleteCustomer(Customers customers) {
        customersList.remove(customers);
    }

    public CustomersController(String name, List<Customers> customersList) {
        this.name = name;
        this.customersList = customersList;
    }

    public CustomersController(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }

}
