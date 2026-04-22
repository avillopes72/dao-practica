package Implementaciones;

import ec.edu.espoch.banco.interfaz.DaoAccountCurrents;

public class AccountCurrentS extends AccountS implements DaoAccountCurrents {

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
