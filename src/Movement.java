import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement extends JPanel implements MouseListener, MouseMotionListener {
    private int x,y;

    private final int MAX_CAR_SIZE=360;
    public Movement(Component... pns){
        for(Component jPanel : pns){
            jPanel.addMouseListener(this);
            jPanel.addMouseMotionListener(this);
        }
    }
    public void mouseDragged(MouseEvent e) {
        /*int collusion=0;*/

        final int CORRECTION = 1;
        final int MAX_X = Board.BOARD_WIDTH_HEIGHT + Board.BOARD_START_X - e.getComponent().getWidth()+CORRECTION;
        final int MAX_Y = Board.BOARD_WIDTH_HEIGHT + Board.BOARD_START_Y - e.getComponent().getHeight()+CORRECTION;

        final int MIN_X = Board.BOARD_START_X + Board.LINE_THICKNESS-CORRECTION;
        final int MIN_Y = Board.BOARD_START_Y + Board.LINE_THICKNESS-CORRECTION;

        /*if(collusion==1){*/
            if(e.getComponent().getWidth()<=MAX_CAR_SIZE && e.getComponent().getHeight()<=MAX_CAR_SIZE){
                //בודק שהמצביע בתוך האובייקט
                if (e.getComponent().contains(e.getPoint())) {
                    //בודק שלא עבר את מקס X
                    if (e.getComponent().getX() < MAX_X || e.getComponent().getGraphics().equals("")) {
                        if (e.getComponent().getX() > MIN_X) {
                            if (e.getComponent().getY() < MAX_Y) {
                                if (e.getComponent().getY() >= MIN_Y) {
                                    //יזוז רק ב-X
                                    if (e.getComponent().getWidth() > e.getComponent().getHeight()) {
                                        //יזוז רק ב-Y
                                        e.getComponent().setLocation(e.getX() + e.getComponent().getX() - x, e.getComponent().getY());
                                    } else {
                                        e.getComponent().setLocation(e.getComponent().getX(), e.getY() + e.getComponent().getY() - y);
                                    }
                                } else {
                                    e.getComponent().setLocation(e.getComponent().getX(), MIN_Y + CORRECTION);
                                }
                            } else {
                                e.getComponent().setLocation(e.getComponent().getX(), MAX_Y - CORRECTION);
                            }
                        }else {
                            e.getComponent().setLocation(MIN_X + CORRECTION, e.getComponent().getY());
                        }
                    } else
                        e.getComponent().setLocation(MAX_X - CORRECTION, e.getComponent().getY());
                }


            }
        }
    /*}*/

    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }

}