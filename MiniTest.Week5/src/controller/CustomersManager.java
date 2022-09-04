package controller;
import model.Bill;
import model.Customers;
public class CustomersManager {
    private Customers customers;
    private CustomersView view;

    public  CustomersManager(Customers customers, CustomersView view){
        this.customers = customers;
        this.view = view;
    }
    public String getName() {
        return customers.getName();
    }
    public void setName(String name) {
        customers.setName(name);
    }
    public int getNumber() {
        return customers.getNumber();
    }
    public void setNumber(int number) {
        customers.setNumber(number);
    }
    public Bill getBill() {
        return customers.getBill();
    }
    public void setBill(Bill bill) {
        customers.setBill(bill);
    }
    public void updateBillView() {
        view.displayCustomers(customers.getName(), customers.getNumber(), customers.getElectricMeterId(), customers.getBill());
    }
}
