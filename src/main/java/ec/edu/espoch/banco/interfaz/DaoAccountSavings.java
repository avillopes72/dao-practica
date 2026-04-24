
package ec.edu.espoch.banco.interfaz;

import ClasesObje.AccountSaving;

public interface DaoAccountSavings {
    public boolean deposit(AccountSaving accountSaving ,float money);

    public float withDraw(float money) ;

    public boolean monthlyStatement();

    public void print() ;
}
