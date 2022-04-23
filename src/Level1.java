import java.awt.*;

public class Level1 {


    public Car[] cars;

    public Level1()
    {

        Car xCar = new Car("xCar",3,2,Color.red);
        Car aCar = new Car("xCar",1,1,Color.green);
        Car bCar = new Car("yCar",5,1,Color.orange);
        Car cCar = new Car("xCar",5,5,Color.cyan);
        Car Truck = new Car("yTruck",1,6,Color.yellow);
        Car pTruck = new Car("yTruck",2,1,Color.magenta);
        Car qTruck = new Car("yTruck",2,4,Color.blue);
        Car rTruck = new Car("xTruck",6,3,Color.green);
        cars= new Car[]{xCar, aCar, bCar, cCar, Truck, pTruck, qTruck, rTruck};
    }


    public Car []getCars() {
        return cars;
    }


}
