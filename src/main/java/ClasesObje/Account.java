
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
// getter
    public float getBalance() {
        return balance;
    }

    public int getDepositNumber() {
        return depositNumber;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public float getAnnullinterestRate() {
        return annullinterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    //settter

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setDepositNumber(int depositNumber) {
        this.depositNumber = depositNumber;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public void setAnnullinterestRate(float annullinterestRate) {
        this.annullinterestRate = annullinterestRate;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    
}
