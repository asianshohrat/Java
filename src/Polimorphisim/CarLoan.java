package Polimorphisim;

public class CarLoan extends Loan {
    double APR;
    double creditScore;

    public CarLoan(int accountNumber, String accountName, Double balance,
                   double interestRate, int numberOfPayments,
                   double loanAmount, double APR, double creditScore) {
        super(accountNumber, accountName, balance, interestRate, numberOfPayments, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;
    }

    public double monthlyPayments(){
        double mountly=super.loanAmount*this.APR/super.numberOfPayments-this.creditScore/10;
        return mountly;
    }

    public double totalPayment(){
        return super.loanAmount*super.interestRate;
    }

    @Override
    public String toString() {
        return "CarLoan{" +
                "creditScore=" + creditScore +
                ", interestRate=" + interestRate +
                ", numberOfPayments=" + numberOfPayments +
                ", loanAmount=" + loanAmount +
                ", accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
