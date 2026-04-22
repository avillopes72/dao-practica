
package ClasesObje;

public class AccountSaving extends Account{
    private boolean statuAccount;

    public AccountSaving(boolean statuAccount, float balance, float annullinterestRate) {
        super(balance, annullinterestRate);
        this.statuAccount = statuAccount;
    }
   // getter
    public boolean isStatuAccount() {
        return statuAccount;
    }

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
    //setter

    public void setStatuAccount(boolean statuAccount) {
        this.statuAccount = statuAccount;
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
