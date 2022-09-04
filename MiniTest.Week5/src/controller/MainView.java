package controller;

import model.Bill;
import model.Customers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;


public class MainView {
    public static Customers createCustomers() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW CUSTOMER<<<<<<<<<");
        System.out.println("1. Enter customer name: ");
        String name = bufferedReader.readLine();
        System.out.println("2. Enter customer number: ");
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println("3. Enter customer electric meter ID: ");
        String electricMeterId = bufferedReader.readLine();
        Bill bill = createNewBill();
        Customers newCustomer = new Customers(name,number,electricMeterId,bill);
        return newCustomer;
    }
    public static Bill createNewBill() throws IOException{
        System.out.println(">>>>>>>>ADD NEW BILL<<<<<<<<<");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Enter old index: ");
        long oldIndex = Long.parseLong(bufferedReader.readLine());
        System.out.println("1. Enter new index: ");
        long newIndex = Long.parseLong(bufferedReader.readLine());

        Bill newBill = new Bill(oldIndex,newIndex);
        return newBill;
    }
    public int mainMenu() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("============== MAIN MENU =============");
        System.out.println("1. Display Customer");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit Customer bu name");
        System.out.println("4. Delete Customer by name");
        System.out.println("5. Customer payment amount");
        System.out.println("6. Load database");
        System.out.println("7. Save database");
        System.out.println(" .....................................");
        System.out.println("0.Quit");
        System.out.println("Enter Option: ");
        option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllCustomer(List<Customers> customersList) {
        System.out.println("################ DISPLAY ALL CUSTOMERS ################");
        Iterator<Customers> iterator = customersList.iterator();
        while (iterator.hasNext()) {
            Customers holder = iterator.next();
            System.out.printf("%-20s%-20s%-20s%-30s\n",holder.getName(),holder.getNumber(),holder.getElectricMeterId(),holder.getBill());
        }
        System.out.println("..................................................................");
    }
    public static String enterNameForm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("------------- ENTER NAME FORM ------------");
        System.out.print("Enter Customer Name: ");
        value = bufferedReader.readLine();
        return value;
    }
}