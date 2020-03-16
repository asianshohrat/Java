package creating_classes;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("saving",4999999.65,1234567);
        myAcc.checkBalance();
        myAcc.addMoney(874697545);
        myAcc.checkBalance();
        myAcc.drawMoney(97975556);
        myAcc.checkBalance();
        myAcc.drawMoney(999999999);
        myAcc.checkBalance();
    }
}
