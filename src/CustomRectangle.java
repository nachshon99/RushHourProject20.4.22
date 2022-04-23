import javax.swing.*;
import java.awt.*;

public class CustomRectangle {
    public int x;
    public int y;
    public int width;
    public int height;
    public Color color;
     Movement movement;
     GameScene gameScene;




    public CustomRectangle(int x, int y, int width, int height, Color color)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public CustomRectangle(){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x)

    {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public  void  update()
    {
       this.x= (int) movement.currentMousePt.getX();
       this.y= (int) movement.currentMousePt.getY();
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public void paint (Graphics g)
    {
        g.fillRect(x,y,width,height);
        g.setColor(color);
    }



}