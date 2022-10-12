package id.co.mandiri.bankapp.test;

import id.co.mandiri.bankapp.domain.Account;
import id.co.mandiri.bankapp.domain.CheckingAccount;
import id.co.mandiri.bankapp.domain.Customer;
import id.co.mandiri.bankapp.domain.SavingAccount;

public class TestAccount2 {
    public static void main(String[] args){
        Customer c1 = new Customer("Anton", "Adi");
        c1.addAccount(new SavingAccount(1000.0));
        c1.addAccount(new CheckingAccount(750, 500));
        c1.addAccount(new CheckingAccount(500, 0.0));


        Account tmpAccount;
        tmpAccount = c1.getAccount(0);
        tmpAccount.deposit(200);
        tmpAccount.withdraw(800);
        tmpAccount.withdraw(500);

        tmpAccount = c1.getAccount(1);
        tmpAccount.deposit(50);
        tmpAccount.withdraw(600);
        tmpAccount.withdraw(600);
        tmpAccount.withdraw(600);

        tmpAccount = c1.getAccount(2);
        tmpAccount.deposit(100);
        tmpAccount.withdraw(350);
        tmpAccount.withdraw(350);

        c1.displayCustomerInfo();
    }
}
