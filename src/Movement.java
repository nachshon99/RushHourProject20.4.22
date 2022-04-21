import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement extends JPanel implements MouseListener, MouseMotionListener {

    private int x,y;
    Car [] cars;
    private final int MAX_CAR_SIZE=360;
    public boolean collision;



    public Movement(Component... pns){

        for(Component jPanel : pns){
            jPanel.addMouseListener(this);
            jPanel.addMouseMotionListener(this);
        }
    }

     void setCars(Car[] cars)
    {
        this.cars=cars;
    }



    public void mouseDragged(MouseEvent e) {
        /*int collusion=0;*/

        final int CORRECTION = 1;
        final int MAX_X = Board.BOARD_WIDTH_HEIGHT + Board.BOARD_START_X - e.getComponent().getWidth() + CORRECTION;
        final int MAX_Y = Board.BOARD_WIDTH_HEIGHT + Board.BOARD_START_Y - e.getComponent().getHeight() + CORRECTION;
        final int MIN_X = Board.BOARD_START_X + Board.LINE_THICKNESS - CORRECTION;
        final int MIN_Y = Board.BOARD_START_Y + Board.LINE_THICKNESS - CORRECTION;

        /*if(collusion==1){*/
        if (e.getComponent().getWidth() <= MAX_CAR_SIZE && e.getComponent().getHeight() <= MAX_CAR_SIZE) {
            //בודק שהמצביע בתוך האובייקט
            if (e.getComponent().contains(e.getPoint())) {


                int i = getIndexOfComponentInsideCarArr(e.getComponent());
                //בודק שלא עבר את מקס X


                if (e.getComponent().getX() < MAX_X) {
                    if (e.getComponent().getX() > MIN_X) {
                        if (e.getComponent().getY() < MAX_Y) {

                            if (checkCollision(e.getComponent()))
                            {
                                System.out.println("shnizel");
                            }
                            if (e.getComponent().getY() >= MIN_Y) {
                                //יזוז רק ב-X
                                if (e.getComponent().getWidth() > e.getComponent().getHeight()) {

                                    //יזוז רק ב-Y
                                    e.getComponent().setLocation(e.getX() + e.getComponent().getX() - x, e.getComponent().getY());
                                } else
                                {
                                    e.getComponent().setLocation(e.getComponent().getX(), e.getY() + e.getComponent().getY() - y);
                                }
                            } else
                            {
                                e.getComponent().setLocation(e.getComponent().getX(), MIN_Y + CORRECTION);
                            }
                        } else
                        {
                            e.getComponent().setLocation(e.getComponent().getX(), MAX_Y - CORRECTION);
                        }
                    } else
                    {
                        e.getComponent().setLocation(MIN_X + CORRECTION, e.getComponent().getY());
                    }
                } else
                {
                    e.getComponent().setLocation(MAX_X - CORRECTION, e.getComponent().getY());
                }


            }
        }
    }

        public  int getIndexOfComponentInsideCarArr(Component component)
        {

            Rectangle collisionBody=new Rectangle(component.getX(),component.getY(),component.getWidth(),component.getHeight());
            int indexOfComponent=0;
            for (int i=0;i<cars.length;i++)
            {
                Rectangle collisionWithOtherComponents=new Rectangle(cars[i].getX(),cars[i].getY(),cars[i].getWidth(),cars[i].getHeight());
                if (collisionBody.intersects(collisionWithOtherComponents))
                {
                    indexOfComponent=i;
                    break;
                }
            }
            return indexOfComponent;
        }

        public boolean checkCollision(Component component)
        {
                boolean collision=false;
                Rectangle collisionBody=new Rectangle(component.getX(),component.getY(),component.getWidth()+11,component.getHeight()+11);
                for (int i=0;i<cars.length;i++)
               {
                   if (getIndexOfComponentInsideCarArr(component)!=i)
                   {
                    Rectangle collisionWithOtherComponents = new Rectangle(cars[i].getX(), cars[i].getY(), cars[i].getWidth(), cars[i].getHeight());
                    if (collisionWithOtherComponents.intersects(collisionBody)) {
                        collision = true;
                        System.out.println("collides");
                    }
                  }
            }
           return collision;
        }


    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
    }
    public void mouseClicked(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e)
    {
        if (e.getButton()==1)
        {
            for (int i=0;i<cars.length;i++)
            {







            }
        }

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }

}