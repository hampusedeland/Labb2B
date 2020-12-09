import java.awt.*;

public class VehicleApplication {

    public static void main(String[] args) {

        CarModel carmod = new CarModel();
       // Timer timer = new Timer(50, );
        Saab95 saab95 = new Saab95(2,Color.black,300, 1650);
        Volvo240 volvo240 = new Volvo240(2,Color.black,240,1600);
        Scania scanis = new Scania(2,Color.black,300,16000);
        saab95.setCurrentDirection("east");
        volvo240.setCurrentDirection("east");
        scanis.setCurrentDirection("east");
        carmod.cars.add(saab95);
        carmod.cars.add(volvo240);
        carmod.cars.add(scanis);
        saab95.setY(0);
        volvo240.setY(200);
        scanis.setY(400);

        CarView carvi = new CarView("frame");

        SpeedViewer spedvi = new SpeedViewer("speedframe");
        CarController cc = new CarController(carvi, carmod,spedvi);


        carvi.drawPanel.receiveCars(carmod.getCars());
        

       // spedvi.createTextFields();

        //här slutade vi
       // carvi.drawPanel.paintComponent(carvi.getGraphics(), volvo240);
        //carvi.drawPanel.paintComponent(carvi.getGraphics(), scanis);
            // försökte alltså få en paintComponent som tar en Car som inparameter.
        cc.startTimer();

    }
}
