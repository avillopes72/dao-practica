
package ec.edu.espoch.banco;

import ClasesObje.Account;
import Implementaciones.AccountS;

public class Banco {

    public static void main(String[] args) {
        AccountS objeAccS=new AccountS();
        Account objAcco=new Account(2.3f,4.5f);
        objeAccS.print(objAcco);
    }
}
