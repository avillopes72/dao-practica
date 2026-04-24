package Implementaciones;

import ClasesObje.Account;

public class AccountS  {
    
    public boolean deposit(Account account ,float money) {
        float newBalance=account.getBalance();
        account.setBalance(newBalance);
        return true;
    }

    public boolean withDraw(Account account, float value) {
        float newBalance=account.getBalance()-value;
        account.setBalance(newBalance);
        return true;
    }

    private float calculateInterest() {
        return 0.0f;
    }

    public boolean monthlyStatement() {
        return true;
    }

    public void print(Account account) {
        System.out.println("Saldo: " + account.getBalance());
        System.out.println("Numero Deposito: " + account.getDepositNumber());
   
}
}
