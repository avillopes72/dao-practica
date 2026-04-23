package Implementaciones;

import ClasesObje.Account;

public class AccountS  {
    
    public boolean deposit(Account account ,float money) {
        float newBalance=account.getBalance();
        account.setBalance(newBalance);
        return true;
    }

    public float withDraw(float money) {
        return 0.0f;
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
