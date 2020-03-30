package Polimorphisim;

public class BankTest {

    public static void main(String[] args) {
        Bank myBank = new Bank(112312,"saving",350.0);
        Loan myLoan = new Loan(213213,"new loan",4000.0,1.05,60,30000);
        Loan myCarLoan = new CarLoan(111,"car",3000.0,1.04,72,400000,1.08,850);
        System.out.println(myCarLoan.CalculateMonthlypayment());

    }
}

