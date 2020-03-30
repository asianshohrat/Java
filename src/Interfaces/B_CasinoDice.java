package Interfaces;

public class B_CasinoDice extends A_Dice {
    public int rollDice(){
        int result = (int)(Math.random()*super.faces)+1;
        return result;
    }
}