
package ClasesObje;

public class AccountSaving extends Account{
    private boolean statuAccount=false;

    public AccountSaving(boolean statuAccount, float balance, float annullinterestRate) {
        super(balance, annullinterestRate);
        this.statuAccount = statuAccount;
    }
   // getter
    public boolean getStatuAccount() {
        return statuAccount;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public int getDepositNumber() {
        return depositNumber;
    }

    @Override
    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    @Override
    public float getAnnullinterestRate() {
        return annullinterestRate;
    }

    @Override
    public float getMonthlyFee() {
        return monthlyFee;
    }
    //setter

    public void setStatuAccount(boolean statuAccount) {
        this.statuAccount = statuAccount;
    }

    @Override
    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public void setDepositNumber(int depositNumber) {
        this.depositNumber = depositNumber;
    }

    @Override
    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    @Override
    public void setAnnullinterestRate(float annullinterestRate) {
        this.annullinterestRate = annullinterestRate;
    }

    @Override
    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    

   
   
    
   
}
