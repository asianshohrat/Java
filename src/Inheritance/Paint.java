package Inheritance;

public class Paint {
    protected String colorName;
    protected double sqrFeet;
    protected double totalPrice;

    public Paint(String colorName, double sqrFeet) {
        this.colorName = colorName;
        this.sqrFeet = sqrFeet;
        this.totalPrice = 0;
    }

    public double CalculatePrice(){
        double gallon = this.sqrFeet / 100;
        this.totalPrice =  gallon * 32.99;
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrFeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }

}
