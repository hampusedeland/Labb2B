import java.awt.*;

public class VehicleApplication {

    public static void main(String[] args) {

        CarModel carmod = new CarModel();
        CarView carvi = new CarView("frame");
        SpeedViewer spedvi = new SpeedViewer("speedframe");

        CarController cc = new CarController(carvi, carmod,spedvi);

        cc.startTimer();

    }
}
