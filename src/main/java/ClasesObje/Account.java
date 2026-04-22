
package ClasesObje;

public class Account {
    protected float balance;
    protected int depositNumber=0;
    protected int numberWithdrawals=0;
    protected float   annullinterestRate;
    protected float monthlyFee=0;
    
    public Account(float balance, float annullinterestRate) {
        this.balance = balance;
        this.annullinterestRate = annullinterestRate;
    }

    
    
}
