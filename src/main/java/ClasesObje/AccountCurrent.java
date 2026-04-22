
package ClasesObje;


public class AccountCurrent extends Account{
    private int overdraft= 0;

    public AccountCurrent(float balance, float annullinterestRate) {
        super(balance, annullinterestRate);
    }

    public int getOverdraft() {
        return overdraft;
    }
    
    //getter

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

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

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
