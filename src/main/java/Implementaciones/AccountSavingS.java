package Implementaciones;

import ec.edu.espoch.banco.interfaz.DaoAccountSavings;

public class AccountSavingS extends AccountS implements DaoAccountSavings {

    public boolean deposit(float money) {
        return true;
    }

    public float withDraw(float money) {
        return 0.0f;
    }

    public boolean monthlyStatement() {
        return true;
    }

    public void print() {

    }
}
