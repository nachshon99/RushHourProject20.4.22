import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {



    public MenuPanel(int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setDoubleBuffered(true);

        JLabel title = new JLabel("Rush Hour");
        title.setBounds((Main.WINDOW_WIDTH / 4),100,600,100);
        Font font = new Font("Arial",Font.BOLD,100);
        title.setFont(font);
        this.add(title);

        JButton startButton = new JButton("Start");
        startButton.setBounds(title.getX() + 150,title.getY() + 200, 200, 100);
        Font StartButtonFont = new Font("Arial", Font.ITALIC, 30);
        startButton.setFont(StartButtonFont);
        this.add(startButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(startButton.getX(),startButton.getY() + 200, 200, 100);
        Font exitButtonFont = new Font("Arial", Font.ITALIC, 30);
        exitButton.setFont(exitButtonFont);
        this.add(exitButton);

        startButton.addActionListener((event) -> {
            this.setVisible(false);
        });

        exitButton.addActionListener((event) -> {
            JFrame frame = new JFrame();
            if(JOptionPane.showConfirmDialog(frame,"Do you want to Exit?", "EXIT",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        });

    }


}
