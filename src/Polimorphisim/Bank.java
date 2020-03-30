package Polimorphisim;

public class Bank {
    int accountNumber;
    String accountName;
    Double balance;

    public Bank(int accountNumber, String accountName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void AddMoney(double amount){
        this.balance+=amount;
    }

    public void DrawMoney(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }
        else
            {
            System.out.println("Not enough balance");
        }
    }

        public void setAccountName (String accountName){
            this.accountName = accountName;
        }


    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
