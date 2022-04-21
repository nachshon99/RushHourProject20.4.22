import javax.swing.*;

public abstract class Level extends JPanel {
     Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
