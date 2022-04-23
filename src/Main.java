import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 900;
    public static final int SLEEP_TIME = 5;
    public GameScene gameScene;


    Main() {

        this.setTitle("RUSH HOUR");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameScene=new GameScene(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        this.add(gameScene);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }




    public static void main(String[] args) {
        Main main=new Main();

    }
}