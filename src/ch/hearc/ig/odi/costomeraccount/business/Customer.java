package ch.hearc.ig.odi.costomeraccount.business;

import java.util.*;

public class Customer {

    private HashMap<String,Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new HashMap<String,Account>();
    }

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        return accounts.get(number);        
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    public void addAccount(String number, String name, double rate) {
        Account acc = new Account(number, name, rate, this);
        this.accounts.put(number, acc);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer N°");
        sb.append(this.number);
        sb.append("\n");
        sb.append("Name : ");
        sb.append(this.lastName);
        sb.append(" ");
        sb.append(this.firstName);
        sb.append("\n");
        sb.append("Accounts : ");
        for (Account acc : this.accounts.values()){
            sb.append(acc.accToString());
        }        
        sb.append("\n");
        return sb.toString();
    }

}
