package ch.hearc.ig.odi.costomeraccount.business;

import java.util.HashMap;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
public class Bank {
    
    private int number;
    private String name;
    private HashMap<String, Account> accounts;
    private HashMap<Integer, Customer> customers;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.accounts = new HashMap<>();
        this.customers = new HashMap<>();
    }
    
    public Account getAccountByNumber(String number) {
        return accounts.get(number);
    }
    
    public Customer getCustomerByNumber(int number) {
        return customers.get(number);
    }
    
    public void addCustomer(int number, String fn, String ln) {
        Customer customer = new Customer(number, fn, ln);
        customers.put(number, Customer);   
    }
    
    public void addAccount(String number, String name, double rate, Customer customer) {
        Account account = new Account(number, name, rate, customer);
        accounts.put(number, account);
    }
    
}
