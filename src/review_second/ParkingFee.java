package review_second;

public class ParkingFee {
    public static void main(String[] args) {
        printParkingFee(20,true);
        printParkingFee(7,false);
    }
    public static void printParkingFee(int hour,boolean member){
        if(member){
            System.out.println("No charge");
        }
        else{
            if(hour>=1 && hour<=2){
                System.out.println("$3");
            }
            else if(hour>2 && hour<7){
                System.out.println("$5");
            }
            else if(hour>=7 && hour <=12){
                System.out.println("$10");
            }
            else if(hour>12){
                System.out.println("$15");
            }
            else{
                System.out.println("invalid hour");
            }
        }
    }
}
