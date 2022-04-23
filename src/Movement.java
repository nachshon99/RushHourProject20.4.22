import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Movement extends JPanel implements MouseListener, MouseMotionListener {

    public Car[] cars;
    private final int MAX_CAR_SIZE=360;
    public Point prevPt;
    public Point currentPt;
    public  Point currentMousePt;
    public  boolean isContains;
    public Car car;
    public int index;
    public boolean isDragging;
    public String carType;





    public Movement(){

    }

    public void mouseDragged(MouseEvent e)
    {

        int x=0;
        int y=0;
        currentMousePt=e.getPoint();
        this.isContains=false;
        this.isDragging=true;


        for (int i=0;i<cars.length;i++)
        {
            Rectangle rectangle=new Rectangle(cars[i].getX(),cars[i].getY(),cars[i].getWidth(),cars[i].getHeight());
            if ( rectangle.contains(e.getPoint()))
            {
                index=i;
                isContains=true;
            }
            if(isContains)
            {
                break;
            }
        }

        if (isContains)
        {
           carType=cars[index].getType();
        }
    }


    public void mousePressed(MouseEvent e)
    {
        prevPt=e.getPoint();
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e)
    {


    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e)
    {
        if(isContains&&isDragging)
        {
            this.currentPt=e.getPoint();


        }


    }

}