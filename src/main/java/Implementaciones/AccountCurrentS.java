package Implementaciones;

import ec.edu.espoch.banco.interfaz.DaoAccountCurrents;

public class AccountCurrentS extends AccountS implements DaoAccountCurrents {

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
