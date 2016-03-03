/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.costomeraccount.application;

import ch.hearc.ig.odi.costomeraccount.business.*;

/**
 *
 * @author steven.habegger
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Customer firstCust = new Customer(1, "Steven", "Habegger");
        firstCust.addAccount("1234", "Salaire", 0.05);
        Account ac1 = firstCust.getAccountByNumber("1234");
        System.out.println("1");
        System.out.println(firstCust.toString());
        ac1.credit(10);
        System.out.println("2");
        System.out.println(firstCust.toString());
        ac1.debit(2);
        System.out.println("3");
        System.out.println(firstCust.toString());
        firstCust.addAccount("1212", "Salaire", 0.05);
        Account ac2 = firstCust.getAccountByNumber("1212");
        ac2.credit(100);
        System.out.println("4");
        System.out.println(firstCust.toString());
        System.out.println("5");
        Account.transfert(7.9, ac1, ac2);
        System.out.println(firstCust.toString());
    }
    
}
