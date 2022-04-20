import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 900;
    public static final int SLEEP_TIME = 5;
    private Level1 level1 =new Level1();
    private MenuPanel menuPanel;
    private Car[] cars = level1.getCars();


    JLabel board;
    Main(){
        menuPanel = new MenuPanel(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        this.add(menuPanel);
        this.setTitle("RUSH HOUR");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);

        JPanel back=new JPanel();
        back.setSize(getSize());
        back.setBackground(Color.white);
        back.setLayout(null);
        back.setLocation(0,0);

        Board board=new Board();

        for (int i = 0; i < level1.getCars().length; i++) {
            JPanel panels[]=new JPanel[level1.getCars().length];
            JPanel jPanel=new JPanel();
            jPanel.setBackground(level1.getCars()[i].getCar().getColor());
            jPanel.setSize(level1.getCars()[i].getCar().getWidth(), level1.getCars()[i].getCar().getHeight());
            jPanel.setLocation(level1.getCars()[i].getCar().getX(), level1.getCars()[i].getCar().getY());

            back.add(jPanel);
        }
        for (int i = 0; i < board.getBOARD().length; i++) {
            JPanel panelBoard=new JPanel();
            panelBoard.setBackground(board.getBOARD()[i].getColor());
            panelBoard.setSize(board.getBOARD()[i].getWidth(),board.getBOARD()[i].getHeight());
            panelBoard.setLocation(board.getBOARD()[i].getX(),board.getBOARD()[i].getY());
            back.add(panelBoard);
        }

        JButton backButton = new JButton("<=");
        backButton.setBounds(810,700,70,70);
        Font backButtonFont = new Font("Arial", Font.ITALIC, 30);
        backButton.setFont(backButtonFont);
        this.add(backButton);

        backButton.addActionListener((event) -> {
            JFrame frame = new JFrame();
            if(JOptionPane.showConfirmDialog(frame,"Do you sure to Exit?", "EXIT",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                menuPanel.setVisible(true);
            }
        });

        Movement mv=new Movement(back.getComponents());

        add(back);

        this.mainGameLoop();
        this.setFocusable(true);
        this.requestFocus();
        setVisible(true);
    }

    public void mainGameLoop(){
        Thread thread = new Thread(() -> {
            while (true){
                for (Car obstacle : cars){
                    if(cars[0].checkCollision(obstacle)){
                        System.out.println("COLLISION!");
                    }
                }
                repaint();
                try {
                    Thread.sleep(SLEEP_TIME);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        Main main=new Main();

    }
}