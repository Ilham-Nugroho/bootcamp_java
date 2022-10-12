package id.co.mandiri.bankapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    // private Account account; ini digunakan jika satu customer hanya boleh 1 rekening
    private List<Account> accounts;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void addAccount(Account acct){
        accounts.add(acct);
    }
    public Account getAccount(int index){
        return accounts.get(index);
    }
    public void displayCustomerInfo(){
        System.out.println("Customer Info: ");
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("No of Accounts: " +accounts.size());
        String accountType=null;
        if(!accounts.isEmpty())
        System.out.println("Account Info: ");
        for (Account acct : accounts){
            System.out.print("Account no ");
            System.out.print(accounts.indexOf(acct) + 1);
            if(acct instanceof SavingAccount){
                accountType="Savings Account";
            } else if (acct instanceof CheckingAccount) {
                accountType="Checking Account";
            }
            System.out.print(": "+accountType);
            System.out.println(", balance: " +acct.getBalance());
        }
    }
}
