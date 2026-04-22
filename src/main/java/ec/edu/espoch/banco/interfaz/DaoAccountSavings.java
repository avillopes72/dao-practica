
package ec.edu.espoch.banco.interfaz;

public interface DaoAccountSavings {
    public boolean deposit(float money) ;

    public float withDraw(float money) ;

    public boolean monthlyStatement();

    public void print() ;
}
