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
    public boolean deposit(AccountSaving accountSaving, float value) {
        boolean resp = false;
        if (accountSaving.getStatuAccount()) {
            resp = super.deposit(accountSaving, value);
        }
        return true;
    }

    @Override
    public boolean withDraw(AccountSaving accountSaving, float value) {
        boolean resp = false;
        if (accountSaving.getStatuAccount()) {
            resp = super.withDraw(accountSaving, value);
        }
        return resp;

    }

    @Override
    public boolean monthlyStatement() {
        return true;
    }

    @Override
    public void print() {

    }
}
