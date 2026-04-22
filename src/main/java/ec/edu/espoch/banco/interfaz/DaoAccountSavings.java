
package ec.edu.espoch.banco.interfaz;

public interface DaoAccountSavings {
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
