package Inheritance;

public class RoadBike extends Bicycle {
    private int tireSize;
    private int handleBarSize;

    public RoadBike ( int tireSize, int handleBarSizeint, int gear, int speed) {
        super (gear, speed);
        this.tireSize = tireSize;
        this.handleBarSize = handleBarSize;
    }
}
