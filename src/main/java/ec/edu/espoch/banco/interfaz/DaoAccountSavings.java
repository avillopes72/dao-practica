
package ec.edu.espoch.banco.interfaz;

import ClasesObje.AccountSaving;

public interface DaoAccountSavings {
    public boolean deposit(AccountSaving accountSaving ,float valuar);

    public boolean withDraw(AccountSaving accountSaving,float value) ;

    public boolean monthlyStatement();

    public void print() ;
}
