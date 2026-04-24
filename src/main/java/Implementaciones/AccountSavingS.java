package Implementaciones;

import ClasesObje.AccountSaving;
import ec.edu.espoch.banco.interfaz.DaoAccountSavings;

public class AccountSavingS extends AccountS implements DaoAccountSavings {

    public AccountSavingS(AccountSaving account) {
        if (account.getBalance() < 1000) {
            account.setStatuAccount(true);
        }
    }

    @Override
    public boolean deposit(AccountSaving accountSaving, float money) {
        if(accountSaving.getStatuAccount()){
            
        }
        return true;
    }

    @Override
    public float withDraw(float money) {
        return 0.0f;
    }

    @Override
    public boolean monthlyStatement() {
        return true;
    }

    @Override
    public void print() {

    }
}
