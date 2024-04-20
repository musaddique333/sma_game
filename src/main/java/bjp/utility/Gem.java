package bjp.utility;
import bjp.controller.CityMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import java.util.Random;

public class Gem {
    private static Location gemLocation;
    public static ImageView imageView;
    private static final Image gem = new Image(Gem.class.getResourceAsStream("/img/gem.png"));

    public static Location getGemLocation()
    {
        return gemLocation;
    }

    public static void setGemLocation(Location newLocation)
    {
        gemLocation = newLocation;
    }

    public static void placeGem(StackPane cityMainStack, GridPane cityMapGrid) {
        Random random = new Random();

        Location gemLocation = new Location("Gem Location",random.nextInt(CityMapController.COLS) , random.nextInt(CityMapController.ROWS));
        setGemLocation(gemLocation);
        cityMapGrid.getChildren().removeIf(node -> node == imageView);

        imageView = new ImageView(gem);
        imageView.setFitWidth(30);
        imageView.setFitHeight(30);
        imageView.setSmooth(true);

        cityMapGrid.add(imageView, gemLocation.getX(), gemLocation.getY());
    }
}
