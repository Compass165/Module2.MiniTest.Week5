package controller;

import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillController {
    String name;
    public static List<Bill> billList = new ArrayList<>();

    public void addNewsBill(Bill bill) {
        billList.add(bill);
    }

    public BillController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
