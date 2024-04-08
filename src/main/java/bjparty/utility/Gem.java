package bjparty.utility;

import bjparty.controller.CityMapController;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Gem {
    public static int gemX;
    public static int gemY;
    public static void placeGem(GridPane cityMapGrid ) {

        // Generate random coordinates for the gem
        Random random = new Random();
        gemX = random.nextInt(CityMapController.COLS);
        gemY = random.nextInt(CityMapController.ROWS);

        // Create a rectangle representing the gem
        Rectangle gemRect = new Rectangle(20, 20);
        gemRect.setFill(Color.RED);

        // Add the gem to the grid at the random coordinates
        cityMapGrid.add(gemRect, gemX, gemY);
    }
}
