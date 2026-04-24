package Implementaciones;

import ClasesObje.Account;
import ClasesObje.AccountSaving;

public class AccountS  {
    
    public boolean deposit(Account account ,float money) {
        float newBalance=account.getBalance();
        account.setBalance(newBalance);
        return true;
    }

    public boolean withDraw(Account account, float value) {
        boolean resp=false;
        if(account.getBalance()>value){
        float newBalance=account.getBalance()-value;
        account.setBalance(newBalance);
            resp=true;
        }
        return resp;
    }

    private float calculateInterest() {
        return 0.0f;
    }

    public boolean monthlyStatement(AccountSaving accountSaving) {
        if(accountSaving.getNumberWithdrawals()>4){
            
        }
        return true;
    }

    public void print(Account account) {
        System.out.println("Saldo: " + account.getBalance());
        System.out.println("Numero Deposito: " + account.getDepositNumber());
   
}
}
