package id.co.mandiri.bankapp.domain;

public class CheckingAccount extends Account{
    private double overdraftAmoount;
    public  CheckingAccount(double initBalance, double overdraftAmoount){
        super(initBalance);
        this.overdraftAmoount = overdraftAmoount;
    }

    public double getOverdraftAmoount() {
        return overdraftAmoount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < getBalance() || !(overdraftAmoount> 0)){
            super.withdraw(amount);
        }else {
            if(overdraftAmoount > 0){
                double overdraftNeeded = amount - getBalance();
                if(overdraftNeeded < overdraftAmoount){
                    super.withdraw(getBalance());
                    overdraftAmoount -= overdraftNeeded;
                } else {
                    System.out.println("Insufficient overdraft amount," + "deficit: " +(overdraftNeeded-overdraftAmoount));
                }
            }
        }

    }
}
