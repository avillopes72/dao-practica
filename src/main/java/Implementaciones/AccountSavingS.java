package Implementaciones;

import ec.edu.espoch.banco.interfaz.DaoAccountSavings;

public class AccountSavingS extends AccountS implements DaoAccountSavings {

    @Override
    public boolean deposit(float money) {
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
