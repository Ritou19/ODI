package ch.hearc.ig.odi.costomeraccount.business;

public class Account {

    private Customer customer;
    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public Account(String number, String name, double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     *
     * @param amount
     */
    public void credit(double amount) {
        balance = balance + amount;
    }

    /**
     *
     * @param amount
     */
    public void debit(double amount) throws Exception {
        if ((balance - amount) <= 0) {
            Throwable e = null;

            throw new Exception("Impossible de créditer le compte, pas assez d'argent", e);
        } else {
            balance = balance - amount;
        }
    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    public static void transfert(double amount, Account source, Account target) throws Exception {
        source.debit(amount);
        target.credit(amount);
    }

    public String accToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Account N°");
        sb.append(this.number);
        sb.append("     ");
        sb.append("Name : ");
        sb.append(this.name);
        sb.append("    Solde: ");
        sb.append(this.balance);
        return sb.toString();
    }

}
