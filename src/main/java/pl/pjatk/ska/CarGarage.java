package pl.pjatk.ska;

import org.springframework.stereotype.Component;

@Component
public class CarGarage {
    private Car car;

    public CarGarage() {
    }

    public CarGarage(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    void printComponentInfo() {
        System.out.println("CarGarage::printComponentInfo()");
    }
}
