package Polimorphisim;

public class HomeLoan extends Loan {
    double PMI;

    public HomeLoan(int accountNumber, String accountName,
                    Double balance, double interestRate, int numberOfPayments,
                    double loanAmount, double PMI) {
        super(accountNumber, accountName, balance, interestRate, numberOfPayments, loanAmount);
        this.PMI = PMI;
    }
    public double calculateMonthlyPayment(){
         return super.loanAmount*super.interestRate/super.numberOfPayments+this.PMI;

    }
    public double totalPayment(){
        return super.loanAmount*super.interestRate+this.PMI*super.numberOfPayments;
    }

    @Override
    public String toString() {
        return "HomeLoan{" +
                "PMI=" + PMI +
                ", interestRate=" + interestRate +
                ", numberOfPayments=" + numberOfPayments +
                ", loanAmount=" + loanAmount +
                ", accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
