package review;

public class CarrangeCalculator {
    public static void main(String[] args) {
        carRange(282.5, 5.5);
    }
    public static int carRange (double mpg, double gallon){
        int range=0;
        double cal=mpg*gallon;
        System.out.println((int)cal);
        return range;
    }
}
