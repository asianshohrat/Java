package abstraction;

import abstraction.Tiling;

public class TilingTest {
    public static void main(String[] args) {
        Tiling myTiles = new Tiling("Alma",5000,0,"wood");
        System.out.println(myTiles.calculateTotalMaterialPrice());
        myTiles.printQuete();
    }
}