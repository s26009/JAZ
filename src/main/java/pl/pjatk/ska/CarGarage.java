package pl.pjatk.ska;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarGarage {
    private Car car;

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

    }
}
