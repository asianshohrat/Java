package Interfaces;

public class D_DiceTest {
    public static void main(String[] args) {
        B_CasinoDice myCasino = new B_CasinoDice();
        System.out.println(myCasino.rollDice());
        C_DarkCasinoDice myDark = new C_DarkCasinoDice();
        System.out.println(myDark.rollDice());
    }
}