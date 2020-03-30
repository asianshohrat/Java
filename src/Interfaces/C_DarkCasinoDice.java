package Interfaces;

public class C_DarkCasinoDice extends B_CasinoDice {
    public int rollDice(){
        return (int)(Math.random()*10)+1;
    }
}