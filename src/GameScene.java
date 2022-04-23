import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class GameScene extends JPanel implements Runnable {

    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 900;
    //public LevelManger currentLevel=new LevelManger(level1);
    public Thread mainLoop;
    public Board board=new Board();
    public CustomRectangle[] boards =board.getBOARD();
    public MenuPanel menuPanel=new MenuPanel(0,0,900,900);
    public Movement movement=new Movement();
    public Level1 level1=new Level1();
    Car[] cars=level1.getCars();
    public final int _FPS = 60;

    public GameScene(int x,int y,int width, int height)
    {

        this.setBounds(x,y,width,height);
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.add(menuPanel);
        this.addMouseListener(movement);
        this.addMouseMotionListener(movement);
        intMovementInCars();
        this.setFocusable(true);
        this.requestFocus();
        this.mainGameLoop();

    }

    public  void  intMovementInCars()
    {
        for (Car car : cars) {
            car.movement = movement;
            car.gameScene = this;
        }


    }


    public void mainGameLoop()
    {
        mainLoop=new Thread(this);
        this.mainLoop.start();
    }


    public void run() {
        double drawInterval = 1000000000 / _FPS; //0.016666
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        while (mainLoop != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                delta--;
                drawCount++;
            }

            if (timer >= 1000000000) {
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void update()
    {

            this.cars[movement.index].update();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (CustomRectangle customRectangle : boards)
        {
            customRectangle.paint(g);
        }
        for (Car car : cars)
        {
            car.getCar().paint(g);
        }
    }
}
