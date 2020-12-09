import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SpeedViewer extends JFrame {

    private static final int X = 400;
    private static final int Y = 400;
    private int numberOfCars;
    private ArrayList<Vehicle> bilisar = new ArrayList<>();
    DrawPanel2 drawPanel = new DrawPanel2(X,Y);
    String speedChecker;
    JLabel carHolder = new JLabel();



    public SpeedViewer(String framename){

        initComponents(framename);

    }

    public void receiveCars(ArrayList<Vehicle> bilar){
        this.bilisar=bilar;
    }
    private void initComponents(String title){

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new GridLayout());

        this.add(drawPanel);
        carHolder.setLayout(new GridLayout(1,0));




        this.add(carHolder);
        carHolder.setBackground(Color.CYAN);
        this.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width-this.getSize().width, dim.height-this.getSize().height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

     void updateSpedometer(String speedInfo){
        carHolder.setText(speedInfo);

    }







}
