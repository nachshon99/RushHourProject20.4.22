import java.awt.*;

public class Level1 extends Level{
    public static int x,y;

    private Car xCar;
    private Car aCar;
    private Car bCar;
    private Car cCar;

    private Car oTruck;
    private Car pTruck;
    private Car qTruck;
    private Car rTruck;
    private Car[] cars;

    Level1()
    {

        xCar = new Car("xCar",3,2,Color.red);
        aCar = new Car("xCar",1,1,Color.green);
        bCar = new Car("yCar",5,1,Color.orange);
        cCar = new Car("xCar",5,5,Color.cyan);

        oTruck = new Car("yTruck",1,6,Color.yellow);
        pTruck = new Car("yTruck",2,1,Color.magenta);
        qTruck = new Car("yTruck",2,4,Color.blue);
        rTruck = new Car("xTruck",6,3,Color.green);

        cars= new Car[]{xCar, aCar, bCar, cCar, oTruck, pTruck, qTruck, rTruck};
    }

    public Car []getCars() {
        return cars;
    }

    public void paint(Graphics graphics)
    {
        for (int i = 0; i < cars.length; i++)
        {
            cars[i].paint(graphics);
        }
    }
    public void drawing(int xx, int yy){
        {
            x=xx;
            y=yy;
            repaint();}
    }

    public Car getXCar() {
        return xCar;
    }

    public Car getACar() {
        return aCar;
    }

    public Car getBCar() {
        return bCar;
    }

    public Car getCCar() {
        return cCar;
    }

    public Car getOTruck() {
        return oTruck;
    }

    public Car getPTruck() {
        return pTruck;
    }

    public Car getQTruck() {
        return qTruck;
    }

    public Car getRTruck() {
        return rTruck;
    }

}