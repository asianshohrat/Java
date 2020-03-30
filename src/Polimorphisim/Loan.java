package Polimorphisim;

public class Loan extends Bank {

    double interestRate;
    int numberOfPayments;
    double loanAmount;

    public Loan(int accountNumber, String accountName,
                Double balance, double interestRate,
                int numberOfPayments, double loanAmount) {

        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numberOfPayments = numberOfPayments;
        this.loanAmount = loanAmount;
    }
    public double CalculateMonthlypayment(){
        double MonthlyPayment=this.loanAmount*this.interestRate/this.numberOfPayments;

        return MonthlyPayment;
    }
    public double TotalPayments(double totalPayments ) {
        totalPayments = loanAmount * interestRate;
        return totalPayments;
    }
}
